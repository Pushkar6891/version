package com.msdw.aps.msfspe.business.service.report;

import com.msdw.aps.fsdataobject.data.models.Fund;
import com.msdw.aps.msfspe.business.MSFSPEConstants;
import com.msdw.aps.msfspe.business.entity.InKindDistribution;
import com.msdw.aps.msfspe.business.jpa.repositories.InKindDistributionRepository;
import com.msdw.aps.msfspe.business.model.InkindDistributionFlatReportDataDto;
import com.msdw.aps.msfspe.business.model.InkindDistributionFlatReportDataDto.InkindDistributionFlatReportDataDtoBuilder;
import com.msdw.aps.msfspe.business.model.InkindDistributionReportDataDto;
import com.msdw.aps.msfspe.entity.fetcher.impl.FundFetcher;
import com.msdw.aps.msfspe.entity.fetcher.impl.InvestorFetcher;
import com.msdw.aps.msfspe.enums.DirectOrderDocReportType;
import com.msdw.aps.msfspe.enums.NoticeReportType;
import com.msdw.aps.msfspe.exception.InternalErrorException;
import com.msdw.aps.msfspe.exception.NotFoundException;
import com.msdw.aps.msfspe.helper.DateUtil;
import com.msdw.aps.msfspe.helper.ExecutorServiceUtil;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.xml.bind.DatatypeConverter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

@Component("inkindDistributionReportDataService")
public class InkindDistributionReportDataServiceImpl implements ReportDataService<InkindDistributionReportDataDto> {

    private InKindDistributionRepository inKindDistributionRepository;
    private FundFetcher fundFetcher;
    private InvestorFetcher investorFetcher;
    private static final String INKIND_DIST_NOT_FOUND_ERR = "Inkind Distribution not found for fundId : %s, investorId : %s and reportDate : %s.";
    private static final String FUND_FOUND_ERR = "%s not found in the database";
    private static final String INVESTOR_NOT_FOUND_ERR = "Investor : %s not found in database.";
    private static final String INKIND_DISTRIBUTION_NOT_FOUND_ERR = "Inkind distribution not found for startDate: %s, endDate: %s and fundIds: %s.";
    private static final String INVALID_STARTDATE = "Invalid startDate: %s";
    private static final String INVALID_ENDDATE = "Invalid endDate: %s";
    private static final String INKIND_DISTRIBUTION_NOT_FOUND_FOR_ORDER_ERR = "Inkind distribution not found for orderId: %s.";

    @Value("${report.executor.core.pool.size:5}")
    private int nThreads;

    @Override
    public InkindDistributionReportDataDto getData(String fundId, String investorId, String reportDate) {
        return null;
    }

    public List<InkindDistributionFlatReportDataDto> getData(List<String> fundIds, String startDate, String endDate) {
        if (CollectionUtils.isEmpty(fundIds)) {
            throw new NotFoundException(String.format(INKIND_DISTRIBUTION_NOT_FOUND_ERR, startDate, endDate, fundIds));
        }
        if (StringUtils.isBlank(startDate)) {
            throw new NotFoundException(String.format(INVALID_STARTDATE, startDate));
        }
        if (StringUtils.isBlank(endDate)) {
            throw new NotFoundException(String.format(INVALID_ENDDATE, endDate));
        }

        List<InkindDistributionFlatReportDataDto> inkindDistributionFlatReportDataDtoList = Collections.synchronizedList(new ArrayList<>());
        ExecutorService es = Executors.newFixedThreadPool(nThreads);
        try {
            ConcurrentHashMap<Fund, List<InKindDistribution>> inkindDistributionsCache = fundIds.stream()
                    .map(fundId -> CompletableFuture.supplyAsync(() -> inKindDistributionRepository.findByDealingDateBetweenAndFundId(DateUtil.getDateFromString(startDate), DateUtil.getDateFromString(endDate), fundId), es)
                            .thenCombineAsync((CompletableFuture.supplyAsync(() -> fundFetcher.getById(fundId), es)), (s1, s2) -> Pair.of(s1, s2), es))
                    .map(CompletableFuture::join)
                    .collect(Collectors.toConcurrentMap(Pair::getSecond, Pair::getFirst, (k1, k2) -> k1, ConcurrentHashMap::new));

            inkindDistributionsCache.forEach((fund, inkindDistributions) -> {
                inkindDistributions.stream()
                        .filter(ikd -> !String.valueOf(MSFSPEConstants.REJECTED).equalsIgnoreCase(ikd.getCapitalDistribution().getApprovalStatus()))
                        .forEach(inkindDistribution -> {
                            InkindDistributionFlatReportDataDtoBuilder inkindDistributionFlatReportDataDtoBuilder = null;
                            if (Objects.isNull(inkindDistribution.getCapitalDistribution().getInvestorReports()) ||
                                    Objects.isNull(inkindDistribution.getCapitalDistribution().getInvestorReports().getImageId())) {
                                inkindDistributionFlatReportDataDtoBuilder = InkindDistributionFlatReportDataDto.builder()
                                        .imageId(null);
                            } else {
                                inkindDistributionFlatReportDataDtoBuilder = InkindDistributionFlatReportDataDto.builder()
                                        .imageId(DatatypeConverter.printHexBinary(ArrayUtils.toPrimitive(inkindDistribution.getCapitalDistribution().getInvestorReports().getImageId())));
                            }
                            InkindDistributionFlatReportDataDto inkindDistributionFlatReportDataDto = inkindDistributionFlatReportDataDtoBuilder
                                    .fundId(fund.getFundId())
                                    .fundName(fund.getFundLegalName())
                                    .investorId(inkindDistribution.getCapitalDistribution().getInvestorId())
                                    .investorName(investorFetcher.getById(inkindDistribution.getCapitalDistribution().getInvestorId()).getInvestorLegalName())
                                    .distributionDate(inkindDistribution.getCapitalDistribution().getDealingDate())
                                    .acquisitionDate(inkindDistribution.getAcquisitionDate())
                                    .securityId(inkindDistribution.getSecurityId())
                                    .securityName(inkindDistribution.getSecurityDescription())
                                    .numberOfShares(inkindDistribution.getNumberOfShares())
                                    .marketValue(inkindDistribution.getMarketValue())
                                    .baseUnitPrice(inkindDistribution.getUnitPrice())
                                    .baseUnitCost(inkindDistribution.getUnitCost())
                                    .baseCurrencyCode(inkindDistribution.getCapitalDistribution().getCurrencyCode())
                                    .localUnitPrice(inkindDistribution.getLocalUnitPrice())
                                    .localUnitCost(inkindDistribution.getLocalUnitCost())
                                    .localCurrencyCode(inkindDistribution.getCapitalDistribution().getCurrencyCode())
                                    .priceAsOfDate(inkindDistribution.getPriceAsOfDate())
                                    .distributionId(inkindDistribution.getCapitalDistribution().getDistributionId())
                                    .importGroupId(inkindDistribution.getCapitalDistribution().getImportGroupId())
                                    .approvalStatus(inkindDistribution.getCapitalDistribution().getApprovalStatus())
                                    .build();
                            inkindDistributionFlatReportDataDtoList.add(inkindDistributionFlatReportDataDto);
                        });
            });
            return inkindDistributionFlatReportDataDtoList;
        } catch (Exception ex) {
            if (ex instanceof NotFoundException) {
                throw new NotFoundException(ex.getMessage());
            }
            throw new InternalErrorException(ex.getMessage());
        } finally {
            ExecutorServiceUtil.shutdownThreads(es);
        }
    }

    public List<InkindDistributionReportDataDto.SecurityDetailsDto> getByOrderId(String orderId) {
        List<InKindDistribution> inKindDistributions = inKindDistributionRepository.findByOrderId(orderId);
        if (CollectionUtils.isEmpty(inKindDistributions)) {
            throw new NotFoundException(String.format(INKIND_DISTRIBUTION_NOT_FOUND_FOR_ORDER_ERR, orderId));
        }
        List<InkindDistributionReportDataDto.SecurityDetailsDto> securityDetailsDtos = new ArrayList<>();
        inKindDistributions.forEach(inKindDistribution -> {
            InkindDistributionReportDataDto.SecurityDetailsDto securityDetailsDto = new InkindDistributionReportDataDto.SecurityDetailsDto();
            securityDetailsDto.setSecurityId(inKindDistribution.getSecurityId());
            securityDetailsDto.setSecurityName(inKindDistribution.getSecurityDescription());
            securityDetailsDto.setNumberOfShares(inKindDistribution.getNumberOfShares());
            securityDetailsDto.setBaseUnitPrice(inKindDistribution.getUnitPrice());
            securityDetailsDto.setBaseUnitCost(inKindDistribution.getUnitCost());
            securityDetailsDto.setBaseCurrencyCode(inKindDistribution.getLocalCurrencyCode());
            securityDetailsDto.setLocalUnitPrice(inKindDistribution.getLocalUnitCost());
            securityDetailsDto.setLocalCurrencyCode(inKindDistribution.getLocalCurrencyCode());
            securityDetailsDto.setMarketValue(inKindDistribution.getMarketValue());
            securityDetailsDto.setAcquisitionDate(inKindDistribution.getAcquisitionDate());
            securityDetailsDtos.add(securityDetailsDto);
        });
        return securityDetailsDtos;
    }

    @Override
    public NoticeReportType getNoticeReportType() {
        return NoticeReportType.INKIND_DISTRIBUTION;
    }

    @Override
    public DirectOrderDocReportType getDirectOrderDocReportType() {
        return null;
    }
}
