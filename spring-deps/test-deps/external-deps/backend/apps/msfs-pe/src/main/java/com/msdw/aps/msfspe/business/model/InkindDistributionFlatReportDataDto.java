package com.msdw.aps.msfspe.business.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class InkindDistributionFlatReportDataDto {
    private String fundId;
    private String fundName;
    private String imageId;
    private String investorId;
    private String investorName;
    private Date distributionDate;
    private Date acquisitionDate;
    private String securityId;
    private String securityName;
    private Integer numberOfShares;
    private BigDecimal marketValue;
    private BigDecimal baseUnitPrice;
    private BigDecimal baseUnitCost;
    private String baseCurrencyCode;
    private BigDecimal localUnitPrice;
    private BigDecimal localUnitCost;
    private String localCurrencyCode;
    private Date priceAsOfDate;
    private String distributionId;
    private String importGroupId;
    private String approvalStatus;
}
