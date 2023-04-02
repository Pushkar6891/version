package com.bharath.boot.jms;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageListener {

	@JmsListener(destination = "${springjms.queue}")
	public void receive(String message) {
		System.out.println("Message received : " + message);
	}
}
