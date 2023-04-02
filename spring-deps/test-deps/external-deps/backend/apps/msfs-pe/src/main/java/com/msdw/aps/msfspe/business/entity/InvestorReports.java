package com.msdw.aps.msfspe.business.entity;

import com.msdw.aps.msfspe.enums.InvestorReportStatus;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "InvestorReports")
@Data
@ToString
@NoArgsConstructor
public class InvestorReports implements Serializable {

    @Id
    @Column(name = "investorReportKey")
    Byte[] investorReportKey;

    @Column(name = "generationRequestKey")
    Byte[] generationRequestKey;

    @Column(name = "fundKey")
    byte[] fundKey;

    @Column(name = "investorKey")
    byte[] investorKey;

    @Column(name = "accountSegmentKey")
    Byte[] accountSegmentKey;

    @Column(name = "reportId")
    String reportId;

    @Column(name = "endDate")
    Date endDate;

    @Column(name = "genDate")
    Date genDate;

    @Column(name = "url")
    String url;

    @Column(name = "orderId")
    String orderId;

    @Column(name = "stale")
    boolean stale;

    @Column(name = "reportError")
    boolean reportError;

    @Column(name = "reportMessage")
    String reportMessage;

    @Column(name = "imageId")
    Byte[] imageId;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    InvestorReportStatus status;

    @Column(name = "lastUser")
    String lastUser;

    @Column(name = "lastUpdatedTS")
    Date lastUpdateTS;
}
