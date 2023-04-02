package com.company.junit4.spring;

import org.springframework.stereotype.Component;

@Component
public class MessageService {

	public String getMessage() {
		return "Hello world!";
	}

}