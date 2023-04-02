package com.dailycodebuffer.springemailclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import javax.mail.MessagingException;

@SpringBootApplication
public class SpringEmailClientApplication {

	@Autowired
	private EmailSenderService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringEmailClientApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {
		
		service.sendSimpleEmail("codereferer@gmail.com",
				"Sample Body for sendSimpleEmail",
				"Sample Subject for sendSimpleEmail");
		
		service.sendEmailWithAttachment("codereferer@gmail.com",
				"This is Email Body with Attachment...",
				"This email has attachment",
				"flower.jpeg");

	}
}
