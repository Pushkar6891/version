package com.baeldung.springbootadminclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baeldung.springbootadminclient.SpringBootAdminClientApplication;

@RestController
public class MyController {

	Logger log = LoggerFactory.getLogger(SpringBootAdminClientApplication.class);

	@GetMapping("/message")
	public String getMessage() {
		log.debug("Logging for message() method....");
		return "Spring boot admin client example";
	}
}