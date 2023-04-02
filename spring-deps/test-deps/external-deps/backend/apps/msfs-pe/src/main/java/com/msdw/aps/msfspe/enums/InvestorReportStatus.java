package com.msdw.aps.msfspe.enums;

public enum InvestorReportStatus {
    GENERATED("GENERATED"),
    INREVIEW("INREVIEW"),
    APPROVED("APPROVED"),
    PUBLISHED("PUBLISHED"),
    SENT("SENT"),
    DISTRIBUTED("DISTRIBUTED"),
    PENDING_GENERATION("PENDING_GENERATION"),
    NOT_APPLICABLE("NOT_APPLICABLE");

    String value;

    public String getValue() {
        return value;
    }

    public static InvestorReportStatus fromValue(String value) {
        for (InvestorReportStatus statusE : InvestorReportStatus.values()) {
            if (statusE.getValue().equalsIgnoreCase(value))
                return statusE;
        }
        throw new IllegalArgumentException(value);
    }

    InvestorReportStatus(String value) {
        this.value = value;
    }
}
