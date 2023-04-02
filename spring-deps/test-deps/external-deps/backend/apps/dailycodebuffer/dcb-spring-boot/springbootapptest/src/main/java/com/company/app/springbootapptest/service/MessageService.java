package com.company.app.springbootapptest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.company.app.springbootapptest.config.ProjectProperties;

@Component
public class MessageService {
	
	@Autowired
	ProjectProperties props;

	public String getSubscriptionMessage(String user) {
		return "Hello " + user + ", Thanks for the subscription!";
	}

}
