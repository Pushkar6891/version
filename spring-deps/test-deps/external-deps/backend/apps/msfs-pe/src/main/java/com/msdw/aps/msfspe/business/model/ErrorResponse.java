package com.msdw.aps.msfspe.business.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@JsonRootName("error")
@JsonPropertyOrder({"timestamp", "status", "error", "message"})
public class ErrorResponse {
    @ApiModelProperty(value = "status")
    private int status;
    @ApiModelProperty(value = "error")
    private String error;
    @ApiModelProperty(value = "message")
    private String message;
    @JsonFormat(pattern = "MM/dd/yyyy HH:mm:ss")
    @ApiModelProperty(value = "timestamp")
    private Date timestamp;
}
