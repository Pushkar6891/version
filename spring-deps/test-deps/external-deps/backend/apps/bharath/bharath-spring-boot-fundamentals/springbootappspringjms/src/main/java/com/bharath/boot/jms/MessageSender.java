package com.bharath.boot.jms;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageSender {

	private final JmsTemplate jmsTemplate;

	@Value("${springjms.queue}")
	private String queue;

	public MessageSender(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public void send(String message) {
		System.out.println("Message sent : " + message);
		jmsTemplate.convertAndSend(queue, message);
	}
}
