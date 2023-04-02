package com.company.app.springbootapptest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.company.app.springbootapptest.service.MessageService;

@RestController
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	@GetMapping("/message")
	public String getMessage(@RequestParam String user) {
		return messageService.getSubscriptionMessage(user);
	}
	
}
