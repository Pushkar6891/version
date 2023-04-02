package com.msdw.aps.msfspe.business.service.report;

import com.msdw.aps.msfspe.enums.NoticeReportType;
import com.msdw.aps.msfspe.exception.InternalErrorException;
import com.msdw.aps.msfspe.exception.NotFoundException;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ContextConfiguration(classes = {InkindDistributionReportDataServiceImpl.class})
@ExtendWith(SpringExtension.class)
class InkindDistributionReportDataServiceImplTest {
    @Autowired
    private InkindDistributionReportDataServiceImpl inkindDistributionReportDataServiceImpl;

    /**
     * Method under test: {@link InkindDistributionReportDataServiceImpl#getData(String, String, String)}
     */
    @Test
    void testGetData() {
        assertNull(inkindDistributionReportDataServiceImpl.getData("42", "42", "2020-03-01"));
        assertThrows(NotFoundException.class,
                () -> inkindDistributionReportDataServiceImpl.getData(new ArrayList<>(), "2020-03-01", "2020-03-01"));
    }

    /**
     * Method under test: {@link InkindDistributionReportDataServiceImpl#getData(List, String, String)}
     */
    @Test
    void testGetData2() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Inkind distribution not found for startDate: %s, endDate: %s and fundIds: %s.");
        assertThrows(InternalErrorException.class,
                () -> inkindDistributionReportDataServiceImpl.getData(stringList, "2020-03-01", "2020-03-01"));
    }

    /**
     * Method under test: {@link InkindDistributionReportDataServiceImpl#getData(List, String, String)}
     */
    @Test
    void testGetData3() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Inkind distribution not found for startDate: %s, endDate: %s and fundIds: %s.");
        assertThrows(NotFoundException.class,
                () -> inkindDistributionReportDataServiceImpl.getData(stringList, "", "2020-03-01"));
    }

    /**
     * Method under test: {@link InkindDistributionReportDataServiceImpl#getData(List, String, String)}
     */
    @Test
    void testGetData4() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Inkind distribution not found for startDate: %s, endDate: %s and fundIds: %s.");
        assertThrows(InternalErrorException.class, () -> inkindDistributionReportDataServiceImpl.getData(stringList,
                "2020-03-01", "Shutting down the executor service."));
    }

    /**
     * Method under test: {@link InkindDistributionReportDataServiceImpl#getData(List, String, String)}
     */
    @Test
    void testGetData5() {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Inkind distribution not found for startDate: %s, endDate: %s and fundIds: %s.");
        assertThrows(NotFoundException.class,
                () -> inkindDistributionReportDataServiceImpl.getData(stringList, "2020-03-01", ""));
    }

    /**
     * Method under test: {@link InkindDistributionReportDataServiceImpl#getByOrderId(String)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetByOrderId() {
        // TODO: Complete this test.
        //   Reason: R013 No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "com.msdw.aps.msfspe.business.jpa.repositories.InKindDistributionRepository.findByOrderId(String)" because "this.inKindDistributionRepository" is null
        //       at com.msdw.aps.msfspe.business.service.report.InkindDistributionReportDataServiceImpl.getByOrderId(InkindDistributionReportDataServiceImpl.java:128)
        //   In order to prevent getByOrderId(String)
        //   from throwing NullPointerException, add constructors or factory
        //   methods that make it easier to construct fully initialized objects used in
        //   getByOrderId(String).
        //   See https://diff.blue/R013 to resolve this issue.

        inkindDistributionReportDataServiceImpl.getByOrderId("42");
    }

    /**
     * Method under test: {@link InkindDistributionReportDataServiceImpl#getNoticeReportType()}
     */
    @Test
    void testGetNoticeReportType() {
        assertEquals(NoticeReportType.INKIND_DISTRIBUTION, inkindDistributionReportDataServiceImpl.getNoticeReportType());
    }

    /**
     * Method under test: {@link InkindDistributionReportDataServiceImpl#getDirectOrderDocReportType()}
     */
    @Test
    void testGetDirectOrderDocReportType() {
        assertNull(inkindDistributionReportDataServiceImpl.getDirectOrderDocReportType());
    }
}

