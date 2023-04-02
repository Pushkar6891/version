package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.service.MessageProviderService;

@RestController
public class MessageProviderController {

	@Autowired
	private MessageProviderService messageProviderService;

	public void setMessageProviderService(MessageProviderService messageProviderService) {
		this.messageProviderService = messageProviderService;
	}

	@GetMapping("/")
	public String hello() {
		return messageProviderService.getMessage();
	}
}
