package com.msdw.aps.msfspe.business.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="InKindDistribution")
@Getter
@Setter
@EqualsAndHashCode(of = "{inKindDistributionId}", callSuper = false)
@ToString
public class InKindDistribution {
    @Id
    private String inKindDistributionId;
    private Date acquisitionDate;
    private String securityId;
    private String securityDescription;
    private Integer numberOfShares;
    private BigDecimal marketValue;
    private BigDecimal unitPrice;
    private BigDecimal unitCost;
    private BigDecimal localUnitPrice;
    private BigDecimal localUnitCost;
    private String localCurrencyCode;
    private Date priceAsOfDate;
    @Transient
    private int extId;
    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "distributionId", updatable = false, nullable = false)
    private CapitalDistribution capitalDistribution;
}
