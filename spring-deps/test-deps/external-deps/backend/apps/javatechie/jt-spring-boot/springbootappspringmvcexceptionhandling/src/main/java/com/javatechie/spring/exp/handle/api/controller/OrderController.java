package com.javatechie.spring.exp.handle.api.controller;

import com.javatechie.spring.exp.handle.api.exception.OrderServiceException;
import com.javatechie.spring.exp.handle.api.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
	private final OrderService service;

	public OrderController(OrderService service) {
		this.service = service;
	}

	@GetMapping("/getPrice/{productName}")
	public String getOrderPrice(@PathVariable String productName) throws OrderServiceException {
		double amount = service.getPrice(productName);
		return "amount for product " + productName + " is " + amount;
	}
}
