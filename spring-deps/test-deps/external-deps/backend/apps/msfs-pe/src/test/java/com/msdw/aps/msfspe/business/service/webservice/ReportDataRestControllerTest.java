package com.msdw.aps.msfspe.business.service.webservice;

import com.msdw.aps.msfspe.business.service.report.InkindDistributionReportDataServiceImpl;
import com.msdw.aps.msfspe.enums.NoticeReportType;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

@ContextConfiguration(classes = {ReportDataRestController.class})
@ExtendWith(SpringExtension.class)
class ReportDataRestControllerTest {
    @MockBean(name = "inkindDistributionReportDataService")
    private InkindDistributionReportDataServiceImpl inkindDistributionReportDataServiceImpl;

    @Autowired
    private ReportDataRestController reportDataRestController;

    /**
     * Method under test: {@link ReportDataRestController#search(NoticeReportType, String, String, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSearch() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.lang.ClassNotFoundException: org.glassfish.jersey.internal.RuntimeDelegateImpl
        //       at javax.ws.rs.ext.RuntimeDelegate.findDelegate(RuntimeDelegate.java:130)
        //       at javax.ws.rs.ext.RuntimeDelegate.getInstance(RuntimeDelegate.java:97)
        //       at javax.ws.rs.core.Response$ResponseBuilder.newInstance(Response.java:840)
        //       at javax.ws.rs.core.Response.status(Response.java:568)
        //       at javax.ws.rs.core.Response.status(Response.java:579)
        //       at com.msdw.aps.msfspe.helper.ResponseUtil.handleError(ResponseUtil.java:15)
        //       at com.msdw.aps.msfspe.business.service.webservice.ReportDataRestController.search(ReportDataRestController.java:55)
        //   In order to prevent search(NoticeReportType, String, String, List)
        //   from throwing RuntimeException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   search(NoticeReportType, String, String, List).
        //   See https://diff.blue/R013 to resolve this issue.

        reportDataRestController.search(NoticeReportType.COMMITMENT, "2020-03-01", "2020-03-01", new ArrayList<>());
    }

    /**
     * Method under test: {@link ReportDataRestController#search(NoticeReportType, String, String, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSearch2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.lang.ClassNotFoundException: org.glassfish.jersey.internal.RuntimeDelegateImpl
        //       at javax.ws.rs.ext.RuntimeDelegate.findDelegate(RuntimeDelegate.java:130)
        //       at javax.ws.rs.ext.RuntimeDelegate.getInstance(RuntimeDelegate.java:97)
        //       at javax.ws.rs.core.Response$ResponseBuilder.newInstance(Response.java:840)
        //       at javax.ws.rs.core.Response.status(Response.java:568)
        //       at javax.ws.rs.core.Response.status(Response.java:579)
        //       at com.msdw.aps.msfspe.helper.ResponseUtil.handleError(ResponseUtil.java:15)
        //       at com.msdw.aps.msfspe.business.service.webservice.ReportDataRestController.search(ReportDataRestController.java:55)
        //   In order to prevent search(NoticeReportType, String, String, List)
        //   from throwing RuntimeException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   search(NoticeReportType, String, String, List).
        //   See https://diff.blue/R013 to resolve this issue.

        reportDataRestController.search(NoticeReportType.CAPITAL_CALL, "2020-03-01", "2020-03-01", new ArrayList<>());
    }

    /**
     * Method under test: {@link ReportDataRestController#search(NoticeReportType, String, String, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSearch3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.lang.ClassNotFoundException: org.glassfish.jersey.internal.RuntimeDelegateImpl
        //       at javax.ws.rs.ext.RuntimeDelegate.findDelegate(RuntimeDelegate.java:130)
        //       at javax.ws.rs.ext.RuntimeDelegate.getInstance(RuntimeDelegate.java:97)
        //       at javax.ws.rs.core.Response$ResponseBuilder.newInstance(Response.java:840)
        //       at javax.ws.rs.core.Response.status(Response.java:568)
        //       at javax.ws.rs.core.Response.status(Response.java:579)
        //       at com.msdw.aps.msfspe.helper.ResponseUtil.handleError(ResponseUtil.java:15)
        //       at com.msdw.aps.msfspe.business.service.webservice.ReportDataRestController.search(ReportDataRestController.java:55)
        //   In order to prevent search(NoticeReportType, String, String, List)
        //   from throwing RuntimeException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   search(NoticeReportType, String, String, List).
        //   See https://diff.blue/R013 to resolve this issue.

        reportDataRestController.search(NoticeReportType.CAPITAL_DISTRIBUTION, "2020-03-01", "2020-03-01",
                new ArrayList<>());
    }

    /**
     * Method under test: {@link ReportDataRestController#search(NoticeReportType, String, String, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSearch4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.lang.ClassNotFoundException: org.glassfish.jersey.internal.RuntimeDelegateImpl
        //       at javax.ws.rs.ext.RuntimeDelegate.findDelegate(RuntimeDelegate.java:130)
        //       at javax.ws.rs.ext.RuntimeDelegate.getInstance(RuntimeDelegate.java:97)
        //       at javax.ws.rs.core.Response$ResponseBuilder.newInstance(Response.java:840)
        //       at javax.ws.rs.core.Response.status(Response.java:568)
        //       at javax.ws.rs.core.Response.status(Response.java:579)
        //       at com.msdw.aps.msfspe.helper.ResponseUtil.handleError(ResponseUtil.java:15)
        //       at com.msdw.aps.msfspe.business.service.webservice.ReportDataRestController.search(ReportDataRestController.java:55)
        //   In order to prevent search(NoticeReportType, String, String, List)
        //   from throwing RuntimeException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   search(NoticeReportType, String, String, List).
        //   See https://diff.blue/R013 to resolve this issue.

        reportDataRestController.search(NoticeReportType.CAPITAL_REBALANCE, "2020-03-01", "2020-03-01",
                new ArrayList<>());
    }

    /**
     * Method under test: {@link ReportDataRestController#search(NoticeReportType, String, String, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSearch5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.lang.ClassNotFoundException: org.glassfish.jersey.internal.RuntimeDelegateImpl
        //       at javax.ws.rs.ext.RuntimeDelegate.findDelegate(RuntimeDelegate.java:130)
        //       at javax.ws.rs.ext.RuntimeDelegate.getInstance(RuntimeDelegate.java:97)
        //       at javax.ws.rs.core.Response$ResponseBuilder.newInstance(Response.java:840)
        //       at javax.ws.rs.core.Response.status(Response.java:568)
        //       at javax.ws.rs.core.Response.status(Response.java:579)
        //       at javax.ws.rs.core.Response.serverError(Response.java:676)
        //       at com.msdw.aps.msfspe.helper.ResponseUtil.handleError(ResponseUtil.java:17)
        //       at com.msdw.aps.msfspe.business.service.webservice.ReportDataRestController.search(ReportDataRestController.java:55)
        //   In order to prevent search(NoticeReportType, String, String, List)
        //   from throwing RuntimeException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   search(NoticeReportType, String, String, List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Report Data request for reportType : {}, fundIds : {}, startDate : {} and endDate : {}");
        reportDataRestController.search(NoticeReportType.COMMITMENT, "2020-03-01", "2020-03-01", stringList);
    }

    /**
     * Method under test: {@link ReportDataRestController#search(NoticeReportType, String, String, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSearch6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.lang.ClassNotFoundException: org.glassfish.jersey.internal.RuntimeDelegateImpl
        //       at javax.ws.rs.ext.RuntimeDelegate.findDelegate(RuntimeDelegate.java:130)
        //       at javax.ws.rs.ext.RuntimeDelegate.getInstance(RuntimeDelegate.java:97)
        //       at javax.ws.rs.core.Response$ResponseBuilder.newInstance(Response.java:840)
        //       at javax.ws.rs.core.Response.status(Response.java:568)
        //       at javax.ws.rs.core.Response.status(Response.java:579)
        //       at com.msdw.aps.msfspe.helper.ResponseUtil.handleError(ResponseUtil.java:15)
        //       at com.msdw.aps.msfspe.business.service.webservice.ReportDataRestController.search(ReportDataRestController.java:55)
        //   In order to prevent search(NoticeReportType, String, String, List)
        //   from throwing RuntimeException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   search(NoticeReportType, String, String, List).
        //   See https://diff.blue/R013 to resolve this issue.

        reportDataRestController.search(NoticeReportType.INKIND_DISTRIBUTION, "2020-03-01", "2020-03-01",
                new ArrayList<>());
    }

    /**
     * Method under test: {@link ReportDataRestController#search(NoticeReportType, String, String, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSearch7() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.lang.ClassNotFoundException: org.glassfish.jersey.internal.RuntimeDelegateImpl
        //       at javax.ws.rs.ext.RuntimeDelegate.findDelegate(RuntimeDelegate.java:130)
        //       at javax.ws.rs.ext.RuntimeDelegate.getInstance(RuntimeDelegate.java:97)
        //       at javax.ws.rs.core.Response$ResponseBuilder.newInstance(Response.java:840)
        //       at javax.ws.rs.core.Response.status(Response.java:568)
        //       at javax.ws.rs.core.Response.status(Response.java:579)
        //       at com.msdw.aps.msfspe.helper.ResponseUtil.handleError(ResponseUtil.java:15)
        //       at com.msdw.aps.msfspe.business.service.webservice.ReportDataRestController.search(ReportDataRestController.java:55)
        //   In order to prevent search(NoticeReportType, String, String, List)
        //   from throwing RuntimeException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   search(NoticeReportType, String, String, List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Report Data request for reportType : {}, fundIds : {}, startDate : {} and endDate : {}");
        reportDataRestController.search(NoticeReportType.COMMITMENT, "2020/03/01", "2020-03-01", stringList);
    }

    /**
     * Method under test: {@link ReportDataRestController#search(NoticeReportType, String, String, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSearch8() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.lang.ClassNotFoundException: org.glassfish.jersey.internal.RuntimeDelegateImpl
        //       at javax.ws.rs.ext.RuntimeDelegate.findDelegate(RuntimeDelegate.java:130)
        //       at javax.ws.rs.ext.RuntimeDelegate.getInstance(RuntimeDelegate.java:97)
        //       at javax.ws.rs.core.Response$ResponseBuilder.newInstance(Response.java:840)
        //       at javax.ws.rs.core.Response.status(Response.java:568)
        //       at javax.ws.rs.core.Response.status(Response.java:579)
        //       at com.msdw.aps.msfspe.helper.ResponseUtil.handleError(ResponseUtil.java:15)
        //       at com.msdw.aps.msfspe.business.service.webservice.ReportDataRestController.search(ReportDataRestController.java:55)
        //   In order to prevent search(NoticeReportType, String, String, List)
        //   from throwing RuntimeException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   search(NoticeReportType, String, String, List).
        //   See https://diff.blue/R013 to resolve this issue.

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Report Data request for reportType : {}, fundIds : {}, startDate : {} and endDate : {}");
        reportDataRestController.search(NoticeReportType.COMMITMENT, "2020-03-01", "2020/03/01", stringList);
    }

    /**
     * Method under test: {@link ReportDataRestController#search(NoticeReportType, String, String, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSearch9() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.lang.ClassNotFoundException: org.glassfish.jersey.internal.RuntimeDelegateImpl
        //       at javax.ws.rs.ext.RuntimeDelegate.findDelegate(RuntimeDelegate.java:130)
        //       at javax.ws.rs.ext.RuntimeDelegate.getInstance(RuntimeDelegate.java:97)
        //       at javax.ws.rs.core.Response$ResponseBuilder.newInstance(Response.java:840)
        //       at javax.ws.rs.core.Response.status(Response.java:568)
        //       at javax.ws.rs.core.Response.status(Response.java:579)
        //       at javax.ws.rs.core.Response.serverError(Response.java:676)
        //       at com.msdw.aps.msfspe.helper.ResponseUtil.handleError(ResponseUtil.java:23)
        //       at com.msdw.aps.msfspe.business.service.webservice.ReportDataRestController.search(ReportDataRestController.java:55)
        //   In order to prevent search(NoticeReportType, String, String, List)
        //   from throwing RuntimeException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   search(NoticeReportType, String, String, List).
        //   See https://diff.blue/R013 to resolve this issue.

        when(inkindDistributionReportDataServiceImpl.getData((List<String>) any(), (String) any(), (String) any()))
                .thenReturn(new ArrayList<>());

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Report Data request for reportType : {}, fundIds : {}, startDate : {} and endDate : {}");
        reportDataRestController.search(NoticeReportType.INKIND_DISTRIBUTION, "2020-03-01", "2020-03-01", stringList);
    }

    /**
     * Method under test: {@link ReportDataRestController#search(NoticeReportType, String, String, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSearch10() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.lang.ClassNotFoundException: org.glassfish.jersey.internal.RuntimeDelegateImpl
        //       at javax.ws.rs.ext.RuntimeDelegate.findDelegate(RuntimeDelegate.java:130)
        //       at javax.ws.rs.ext.RuntimeDelegate.getInstance(RuntimeDelegate.java:97)
        //       at javax.ws.rs.core.Response$ResponseBuilder.newInstance(Response.java:840)
        //       at javax.ws.rs.core.Response.status(Response.java:568)
        //       at javax.ws.rs.core.Response.status(Response.java:579)
        //       at com.msdw.aps.msfspe.helper.ResponseUtil.handleError(ResponseUtil.java:15)
        //       at com.msdw.aps.msfspe.business.service.webservice.ReportDataRestController.search(ReportDataRestController.java:55)
        //   In order to prevent search(NoticeReportType, String, String, List)
        //   from throwing RuntimeException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   search(NoticeReportType, String, String, List).
        //   See https://diff.blue/R013 to resolve this issue.

        when(inkindDistributionReportDataServiceImpl.getData((List<String>) any(), (String) any(), (String) any()))
                .thenThrow(new IllegalArgumentException(
                        "Report Data request for reportType : {}, fundIds : {}, startDate : {} and endDate : {}"));

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Report Data request for reportType : {}, fundIds : {}, startDate : {} and endDate : {}");
        reportDataRestController.search(NoticeReportType.INKIND_DISTRIBUTION, "2020-03-01", "2020-03-01", stringList);
    }

    /**
     * Method under test: {@link ReportDataRestController#getByOrderId(NoticeReportType, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetByOrderId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.lang.ClassNotFoundException: org.glassfish.jersey.internal.RuntimeDelegateImpl
        //       at javax.ws.rs.ext.RuntimeDelegate.findDelegate(RuntimeDelegate.java:130)
        //       at javax.ws.rs.ext.RuntimeDelegate.getInstance(RuntimeDelegate.java:97)
        //       at javax.ws.rs.core.Response$ResponseBuilder.newInstance(Response.java:840)
        //       at javax.ws.rs.core.Response.status(Response.java:568)
        //       at javax.ws.rs.core.Response.status(Response.java:579)
        //       at javax.ws.rs.core.Response.serverError(Response.java:676)
        //       at com.msdw.aps.msfspe.helper.ResponseUtil.handleError(ResponseUtil.java:17)
        //       at com.msdw.aps.msfspe.business.service.webservice.ReportDataRestController.getByOrderId(ReportDataRestController.java:91)
        //   In order to prevent getByOrderId(NoticeReportType, String)
        //   from throwing RuntimeException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getByOrderId(NoticeReportType, String).
        //   See https://diff.blue/R013 to resolve this issue.

        reportDataRestController.getByOrderId(NoticeReportType.COMMITMENT, "42");
    }

    /**
     * Method under test: {@link ReportDataRestController#getByOrderId(NoticeReportType, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetByOrderId2() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.lang.ClassNotFoundException: org.glassfish.jersey.internal.RuntimeDelegateImpl
        //       at javax.ws.rs.ext.RuntimeDelegate.findDelegate(RuntimeDelegate.java:130)
        //       at javax.ws.rs.ext.RuntimeDelegate.getInstance(RuntimeDelegate.java:97)
        //       at javax.ws.rs.core.Response$ResponseBuilder.newInstance(Response.java:840)
        //       at javax.ws.rs.core.Response.status(Response.java:568)
        //       at javax.ws.rs.core.Response.status(Response.java:579)
        //       at javax.ws.rs.core.Response.serverError(Response.java:676)
        //       at com.msdw.aps.msfspe.helper.ResponseUtil.handleError(ResponseUtil.java:17)
        //       at com.msdw.aps.msfspe.business.service.webservice.ReportDataRestController.getByOrderId(ReportDataRestController.java:91)
        //   In order to prevent getByOrderId(NoticeReportType, String)
        //   from throwing RuntimeException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getByOrderId(NoticeReportType, String).
        //   See https://diff.blue/R013 to resolve this issue.

        reportDataRestController.getByOrderId(NoticeReportType.CAPITAL_CALL, "42");
    }

    /**
     * Method under test: {@link ReportDataRestController#getByOrderId(NoticeReportType, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetByOrderId3() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.lang.ClassNotFoundException: org.glassfish.jersey.internal.RuntimeDelegateImpl
        //       at javax.ws.rs.ext.RuntimeDelegate.findDelegate(RuntimeDelegate.java:130)
        //       at javax.ws.rs.ext.RuntimeDelegate.getInstance(RuntimeDelegate.java:97)
        //       at javax.ws.rs.core.Response$ResponseBuilder.newInstance(Response.java:840)
        //       at javax.ws.rs.core.Response.status(Response.java:568)
        //       at javax.ws.rs.core.Response.status(Response.java:579)
        //       at javax.ws.rs.core.Response.serverError(Response.java:676)
        //       at com.msdw.aps.msfspe.helper.ResponseUtil.handleError(ResponseUtil.java:17)
        //       at com.msdw.aps.msfspe.business.service.webservice.ReportDataRestController.getByOrderId(ReportDataRestController.java:91)
        //   In order to prevent getByOrderId(NoticeReportType, String)
        //   from throwing RuntimeException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getByOrderId(NoticeReportType, String).
        //   See https://diff.blue/R013 to resolve this issue.

        reportDataRestController.getByOrderId(NoticeReportType.CAPITAL_DISTRIBUTION, "42");
    }

    /**
     * Method under test: {@link ReportDataRestController#getByOrderId(NoticeReportType, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetByOrderId4() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.lang.ClassNotFoundException: org.glassfish.jersey.internal.RuntimeDelegateImpl
        //       at javax.ws.rs.ext.RuntimeDelegate.findDelegate(RuntimeDelegate.java:130)
        //       at javax.ws.rs.ext.RuntimeDelegate.getInstance(RuntimeDelegate.java:97)
        //       at javax.ws.rs.core.Response$ResponseBuilder.newInstance(Response.java:840)
        //       at javax.ws.rs.core.Response.status(Response.java:568)
        //       at javax.ws.rs.core.Response.status(Response.java:579)
        //       at javax.ws.rs.core.Response.serverError(Response.java:676)
        //       at com.msdw.aps.msfspe.helper.ResponseUtil.handleError(ResponseUtil.java:17)
        //       at com.msdw.aps.msfspe.business.service.webservice.ReportDataRestController.getByOrderId(ReportDataRestController.java:91)
        //   In order to prevent getByOrderId(NoticeReportType, String)
        //   from throwing RuntimeException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getByOrderId(NoticeReportType, String).
        //   See https://diff.blue/R013 to resolve this issue.

        reportDataRestController.getByOrderId(NoticeReportType.CAPITAL_REBALANCE, "42");
    }

    /**
     * Method under test: {@link ReportDataRestController#getByOrderId(NoticeReportType, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetByOrderId5() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.lang.ClassNotFoundException: org.glassfish.jersey.internal.RuntimeDelegateImpl
        //       at javax.ws.rs.ext.RuntimeDelegate.findDelegate(RuntimeDelegate.java:130)
        //       at javax.ws.rs.ext.RuntimeDelegate.getInstance(RuntimeDelegate.java:97)
        //       at javax.ws.rs.core.Response$ResponseBuilder.newInstance(Response.java:840)
        //       at javax.ws.rs.core.Response.status(Response.java:568)
        //       at javax.ws.rs.core.Response.status(Response.java:579)
        //       at javax.ws.rs.core.Response.serverError(Response.java:676)
        //       at com.msdw.aps.msfspe.helper.ResponseUtil.handleError(ResponseUtil.java:23)
        //       at com.msdw.aps.msfspe.business.service.webservice.ReportDataRestController.getByOrderId(ReportDataRestController.java:91)
        //   In order to prevent getByOrderId(NoticeReportType, String)
        //   from throwing RuntimeException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getByOrderId(NoticeReportType, String).
        //   See https://diff.blue/R013 to resolve this issue.

        when(inkindDistributionReportDataServiceImpl.getByOrderId((String) any())).thenReturn(new ArrayList<>());
        reportDataRestController.getByOrderId(NoticeReportType.INKIND_DISTRIBUTION, "42");
    }

    /**
     * Method under test: {@link ReportDataRestController#getByOrderId(NoticeReportType, String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetByOrderId6() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.RuntimeException: java.lang.ClassNotFoundException: org.glassfish.jersey.internal.RuntimeDelegateImpl
        //       at javax.ws.rs.ext.RuntimeDelegate.findDelegate(RuntimeDelegate.java:130)
        //       at javax.ws.rs.ext.RuntimeDelegate.getInstance(RuntimeDelegate.java:97)
        //       at javax.ws.rs.core.Response$ResponseBuilder.newInstance(Response.java:840)
        //       at javax.ws.rs.core.Response.status(Response.java:568)
        //       at javax.ws.rs.core.Response.status(Response.java:579)
        //       at com.msdw.aps.msfspe.helper.ResponseUtil.handleError(ResponseUtil.java:15)
        //       at com.msdw.aps.msfspe.business.service.webservice.ReportDataRestController.getByOrderId(ReportDataRestController.java:91)
        //   In order to prevent getByOrderId(NoticeReportType, String)
        //   from throwing RuntimeException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getByOrderId(NoticeReportType, String).
        //   See https://diff.blue/R013 to resolve this issue.

        when(inkindDistributionReportDataServiceImpl.getByOrderId((String) any()))
                .thenThrow(new IllegalArgumentException("Report Data request for reportType : {}, orderId : {}"));
        reportDataRestController.getByOrderId(NoticeReportType.INKIND_DISTRIBUTION, "42");
    }
}

