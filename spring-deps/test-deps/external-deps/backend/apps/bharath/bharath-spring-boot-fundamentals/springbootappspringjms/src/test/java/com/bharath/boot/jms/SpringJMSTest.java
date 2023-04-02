package com.bharath.boot.jms;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Ignore
public class SpringJMSTest {

	@Autowired
	private MessageSender messageSender;

	@Test
	public void testSendAndReceive() {
		messageSender.send("Hello Spring JMS !!!");
	}

}
