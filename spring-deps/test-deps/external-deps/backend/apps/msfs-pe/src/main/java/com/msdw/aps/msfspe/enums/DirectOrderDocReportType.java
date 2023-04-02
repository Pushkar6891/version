package com.msdw.aps.msfspe.enums;

public enum DirectOrderDocReportType {
    COMMITMENT("Commitment"),
    CAPITAL_CALL("Capital Call"),
    CAPITAL_DISTRIBUTION("Capital Distribution"),
    CAPITAL_REBALANCE("Capital Rebalance"),
    INKIND_DISTRIBUTION("InKind Distribution");

    private String reportDesc;

    DirectOrderDocReportType(String reportDesc) {
        this.reportDesc = reportDesc;
    }

    public String getReportDesc() {
        return reportDesc;
    }
}
