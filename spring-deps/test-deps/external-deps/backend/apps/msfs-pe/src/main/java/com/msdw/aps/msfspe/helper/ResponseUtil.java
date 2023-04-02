package com.msdw.aps.msfspe.helper;

import com.msdw.aps.msfspe.business.model.ErrorResponse;
import com.msdw.aps.msfspe.exception.InternalErrorException;
import com.msdw.aps.msfspe.exception.NotFoundException;
import org.springframework.http.HttpStatus;

import javax.ws.rs.core.Response;
import java.util.Date;

public class ResponseUtil {

    public static Response handleError(Exception ex) {
        if (ex instanceof IllegalArgumentException) {
            return Response.status(Response.Status.BAD_REQUEST).entity(getErrorResponse(HttpStatus.BAD_REQUEST, ex.getMessage())).build();
        } else if (ex instanceof UnsupportedOperationException) {
            return Response.serverError().entity(ResponseUtil.getErrorResponse(HttpStatus.NOT_IMPLEMENTED, ex.getMessage())).build();
        } else if (ex instanceof NotFoundException) {
            return Response.status(Response.Status.NOT_FOUND).entity(ResponseUtil.getErrorResponse(HttpStatus.NOT_FOUND, ex.getMessage())).build();
        } else if (ex instanceof InternalErrorException) {
            return Response.serverError().entity(ResponseUtil.getErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage())).build();
        } else {
            return Response.serverError().entity(ResponseUtil.getErrorResponse(HttpStatus.INTERNAL_SERVER_ERROR, ex.getMessage())).build();
        }
    }

    public static ErrorResponse getErrorResponse(HttpStatus status, String message) {
        return new ErrorResponse(status.value(), status.name(), message, new Date());
    }
}
