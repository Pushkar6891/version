package com.msdw.aps.msfspe.business.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import java.io.Serializable;

public class PEOrderProcessStatus implements Serializable {

    @EmbeddedId
    PEOrderProcessStatusPk peOrderProcessStatusPk;
    @Column
    private boolean isCompleted;
    @Column
    private String failureReason;
    @Column
    private byte[] sourceImageKey;
    @Column
    private String orderId;
    @Column
    private String workCaseId;
    @Column
    private byte[] investorReportKey;
}
