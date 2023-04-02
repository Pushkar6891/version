package com.msdw.aps.msfspe.enums;

public enum NoticeReportType {
    COMMITMENT("Commitment"),
    CAPITAL_CALL("Capital Call"),
    CAPITAL_DISTRIBUTION("Capital Distribution"),
    CAPITAL_REBALANCE("Capital Rebalance"),
    INKIND_DISTRIBUTION("InKind Distribution");

    private String reportDesc;

    NoticeReportType(String reportDesc) {
        this.reportDesc = reportDesc;
    }

    public String getReportDesc() {
        return reportDesc;
    }
}
