package com.msdw.aps.msfspe.business.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@Builder
public class InkindDistributionReportDataDto {
    private String fundId;
    private String fundName;
    private String investorId;
    private String investorName;
    private String reportDate;
    private BigDecimal amount;
    @JsonProperty("securityDetails")
    List<SecurityDetailsDto> securityDetailsDto;

    @Data
    public static class SecurityDetailsDto {
        private String securityId;
        private String securityName;
        private Integer numberOfShares;
        private BigDecimal baseUnitPrice;
        private BigDecimal baseUnitCost;
        private BigDecimal localUnitPrice;
        private BigDecimal localUnitCost;
        private String baseCurrencyCode;
        private String localCurrencyCode;
        private BigDecimal marketValue;
        private Date acquisitionDate;
    }
}
