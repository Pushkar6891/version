package com.javatechie.spring.exp.handle.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.javatechie.spring.exp.handle.api.exception.OrderServiceException;
import com.javatechie.spring.exp.handle.api.model.OrderError;

@ControllerAdvice
public class ExceptionAdvice {

	@ExceptionHandler(OrderServiceException.class)
	public ResponseEntity<OrderError> mapException(OrderServiceException ex) {
		OrderError error = new OrderError(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getMessage());
		return new ResponseEntity<OrderError>(error, HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
