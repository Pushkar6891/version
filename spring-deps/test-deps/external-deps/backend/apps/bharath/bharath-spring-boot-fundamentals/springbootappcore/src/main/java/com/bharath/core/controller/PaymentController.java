package com.bharath.core.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.bharath.core.service.PaymentService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

	@Autowired
	private PaymentService paymentService;

	@RequestMapping("/payment")
	public String getPayment() {
		return paymentService.doPayment();
	}

}
