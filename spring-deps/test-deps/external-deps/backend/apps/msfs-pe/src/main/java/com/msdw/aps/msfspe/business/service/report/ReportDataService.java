package com.msdw.aps.msfspe.business.service.report;

import com.msdw.aps.msfspe.enums.DirectOrderDocReportType;
import com.msdw.aps.msfspe.enums.NoticeReportType;

public interface ReportDataService<T> {
    String DEALING_DATE = "Dealing Date";
    String DUE_DATE = "Due Date";

    T getData(String fundId, String investorId, String reportDate);

    NoticeReportType getNoticeReportType();

    DirectOrderDocReportType getDirectOrderDocReportType();
}
