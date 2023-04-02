package com.javatechie.spring.camel.api.processor;

import com.javatechie.spring.camel.api.dto.Order;
import com.javatechie.spring.camel.api.service.OrderService;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component
public class OrderProcessor implements Processor {

    private final OrderService service;

    public OrderProcessor(OrderService service) {
        this.service = service;
    }

    @Override
    public void process(Exchange exchange) {
        service.addOrder(exchange.getIn().getBody(Order.class));
    }

}
