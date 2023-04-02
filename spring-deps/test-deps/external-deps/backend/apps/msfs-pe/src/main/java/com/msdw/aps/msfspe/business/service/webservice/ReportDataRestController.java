package com.msdw.aps.msfspe.business.service.webservice;

import com.msdw.aps.msfspe.business.model.ErrorResponse;
import com.msdw.aps.msfspe.business.service.report.InkindDistributionReportDataServiceImpl;
import com.msdw.aps.msfspe.enums.NoticeReportType;
import com.msdw.aps.msfspe.helper.ResponseUtil;
import io.swagger.annotations.*;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@RestController("reportDataRestService")
@Api
@Path("v1/report-data")
@Slf4j
@AllArgsConstructor
@ApiResponses(value = {@ApiResponse(code = 400, message = "Bad Request", response = ErrorResponse.class),
        @ApiResponse(code = 404, message = "Not Found", response = ErrorResponse.class),
        @ApiResponse(code = 500, message = "Internal server error", response = ErrorResponse.class),
        @ApiResponse(code = 501, message = "Not Implemented", response = ErrorResponse.class)})
public class ReportDataRestController {

    private static final String REPORT_TYPE_NOT_SUPPORTED_ERR = "reportType : %s is not supported";
    private static final String REPORT_DATA_FORMAT_YYYYMMDD = "yyyy-MM-dd";
    private static final String REPORT_DATA_FORMAT_MMDDYYYY = "MM/dd/yyyy";
    private static final String REPORT_TYPE_FORMAT_ERR = "reportDate must be passed in the data format : %s";
    private final InkindDistributionReportDataServiceImpl inkindDistributionReportDataService;

    @POST
    @Path("/{reportType}/funds")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @ApiOperation(httpMethod = "POST", value = "API to return report data at fund level", notes = "API to return report data at fund level")
    public Response search(@ApiParam(value = "reportType", required = true, example = "INKIND_DISTRIBUTION") @PathParam("reportType") NoticeReportType reportType,
                           @ApiParam(value = "startDate", required = true, example = "2018-12-31") @QueryParam("startDate") String startDate,
                           @ApiParam(value = "endDate", required = true, example = "2023-02-28") @QueryParam("endDate") String endDate,
                           @ApiParam(value = "fundIds", required = true, example = "[\"F000003164\",\"F000004360\"]") @PathParam("reportType") @RequestBody List<String> fundIds) {
        log.info("Report Data request for reportType : {}, fundIds : {}, startDate : {} and endDate : {}", reportType, fundIds, startDate, endDate);
        try {
            validateParams(fundIds, startDate, endDate, reportType);
            Object reportDate = inkindDistributionReportDataService.getData(fundIds, startDate, endDate);
            return Response.ok(reportDate).build();
        } catch (Exception ex) {
            log.error("Exception : {}", ex.getMessage(), ex);
            return ResponseUtil.handleError(ex);
        }
    }

    private void validateParams(List<String> fundIds, String startDate, String endDate, NoticeReportType reportType) {
        Assert.isTrue(CollectionUtils.isNotEmpty(fundIds), "fundIds can not be blank.");
        try {
            new SimpleDateFormat(REPORT_DATA_FORMAT_YYYYMMDD).parse(startDate);
        } catch (ParseException e) {
            throw new IllegalArgumentException(String.format(REPORT_TYPE_FORMAT_ERR, REPORT_DATA_FORMAT_YYYYMMDD));
        }
        try {
            new SimpleDateFormat(REPORT_DATA_FORMAT_YYYYMMDD).parse(endDate);
        } catch (ParseException e) {
            throw new IllegalArgumentException(String.format(REPORT_TYPE_FORMAT_ERR, REPORT_DATA_FORMAT_YYYYMMDD));
        }
        if (!String.valueOf(NoticeReportType.INKIND_DISTRIBUTION).equalsIgnoreCase(String.valueOf(reportType))) {
            throw new UnsupportedOperationException(String.format(REPORT_TYPE_NOT_SUPPORTED_ERR, reportType));
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{reportType}/orderId/{orderId}")
    @ApiOperation(httpMethod = "GET", value = "API to return report data for given orderId", notes = "API to return report data for given orderId")
    public Response getByOrderId(@ApiParam(value = "reportType", required = true, example = "INKIND_DISTRIBUTION") @PathParam("reportType") NoticeReportType reportType,
                                 @ApiParam(value = "orderId", required = true, example = "T012640822") @PathParam("orderId") String orderId) {
        log.info("Report Data request for reportType : {}, orderId : {}", reportType, orderId);
        try {
            if (reportType == NoticeReportType.INKIND_DISTRIBUTION) {
                Object reportData = inkindDistributionReportDataService.getByOrderId(orderId);
                return Response.ok(reportData).build();
            } else
                throw new UnsupportedOperationException(String.format(REPORT_TYPE_NOT_SUPPORTED_ERR, reportType));
        } catch (Exception ex) {
            log.error("Exception : {}", ex.getMessage(), ex);
            return ResponseUtil.handleError(ex);
        }
    }

}