package com.msdw.aps.msfspe.business.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CapitalDistribution")
@Getter
@Setter
@ToString
@EqualsAndHashCode(of = {"extId", "distributionId", "transactionType", "subTransactionType", "fundId", "investorId", "dealingDate"}, callSuper = false)
public class CapitalDistribution {
    @Id
    @Column(name = "distributionId")
    private String distributionId;

    @Column(name = "accountSegmentId")
    private String accountSegmentId;

    @Column(name = "fundPartitionId")
    private String fundPartitionId;

    @Column(name = "fundId")
    private String fundId;

    @Column(name = "investorId")
    private String investorId;

    @Column(name = "orderId")
    private String orderId;

    @Column(name = "transactionType")
    private String transactionType;

    @Column(name = "subTransactionType")
    private String subTransactionType;

    @Column(name = "dealingDate")
    private Date dealingDate;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "currencyCode")
    private String currencyCode;

    @Column(name = "isInKind")
    private boolean isInKind;

    @Column(name = "inKindAmount")
    private BigDecimal inKindAmount;

    @Column(name = "isEndOfPeriodTrans")
    private boolean isEndOfPeriodTrans;

    @ManyToOne
    @JoinColumn(name = "investorReportKey")
    private InvestorReports investorReports;

    @Column(name = "notes")
    private String notes;

    @Column(name = "initialWiredAmount")
    private BigDecimal initialWiredAmount;

    @Column(name = "createTS")
    private Date createTS;

    @Column(name = "createdUserId")
    private String createdUserId;

    @Column(name = "updateTS")
    private Date updateTS;

    @Column(name = "updateUserId")
    private String updateUserId;

    @Column(name = "hasWireMovements")
    private boolean hasWireMovements;

    @Column(name = "importGroupId")
    private String importGroupId;

    @Column(name = "approvalStatus")
    private String approvalStatus;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "rebalanceId")
    private CapitalRebalance rebalance;

    @Transient
    private int extId;

    @ManyToOne
    @JoinColumn(name = "investorReportKey", referencedColumnName = "investorReportKey", insertable = false, updatable = false, nullable = true)
    private PEOrderProcessStatus peOrderProcessStatus;

    @OneToMany(mappedBy = "capitalDistribution", cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    private List<InKindDistribution> inKindDistributions;
}
