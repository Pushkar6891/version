package com.company.app.springbootapptest.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/*
 * JUnit 5 test for Spring Boot Component
 */

@SpringBootTest
public class SpringBootJUnit5ServiceTest {

	@Autowired
	private MessageService messageService;

	@Test
	@DisplayName("Subscription message service test ")
	void testGetSubscriptionMessage() {

		String user = "Peter";

		String message = messageService.getSubscriptionMessage(user);
		assertEquals("Hello " + user + ", Thanks for the subscription!", message);
	}
}
