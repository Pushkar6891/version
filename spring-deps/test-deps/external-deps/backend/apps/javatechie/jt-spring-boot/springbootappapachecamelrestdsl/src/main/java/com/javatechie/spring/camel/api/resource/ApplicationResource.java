package com.javatechie.spring.camel.api.resource;

import com.javatechie.spring.camel.api.dto.Order;
import com.javatechie.spring.camel.api.processor.OrderProcessor;
import com.javatechie.spring.camel.api.service.OrderService;
import org.apache.camel.BeanInject;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class ApplicationResource extends RouteBuilder {

	@BeanInject
	private OrderProcessor processor;

	private final OrderService service;

	public ApplicationResource(OrderService service) {
		this.service = service;
	}

	@Override
	public void configure() throws Exception {
		restConfiguration().component("servlet").port(9090).host("localhost").bindingMode(RestBindingMode.json);

		rest().get("/hello-world").produces(MediaType.APPLICATION_JSON_VALUE).route()
				.setBody(constant("Welcome to java techie")).endRest();

		rest().get("/getOrders").produces(MediaType.APPLICATION_JSON_VALUE).route().setBody(() -> service.getOrders())
				.endRest();

		rest().post("/addOrder").consumes(MediaType.APPLICATION_JSON_VALUE).type(Order.class).outType(Order.class)
				.route().process(processor).endRest();
	}

}
