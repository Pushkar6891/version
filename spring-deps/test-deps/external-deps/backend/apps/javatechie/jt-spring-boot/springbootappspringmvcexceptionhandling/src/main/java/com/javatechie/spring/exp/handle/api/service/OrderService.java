package com.javatechie.spring.exp.handle.api.service;

import com.javatechie.spring.exp.handle.api.dao.OrderDAO;
import com.javatechie.spring.exp.handle.api.exception.OrderServiceException;
import com.javatechie.spring.exp.handle.api.model.Order;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
	private final OrderDAO dao;

	public OrderService(OrderDAO dao) {
		this.dao = dao;
	}

	@PostConstruct
	public void addOrder2DB() {
		List<Order> orders = new ArrayList<>();
		orders.add(new Order(876, "Mobile", "Electronics", 8000));
		orders.add(new Order(806, "Bike", "Vehicle", 90000));
		dao.saveAll(orders);
	}

	public double getPrice(String productName) throws OrderServiceException {
		Order order;
		double amount;
		try {
			order = dao.findByName(productName);
			amount = order.getAmount();
		} catch (Exception e) {
			throw new OrderServiceException("order not found with product : " + productName);
		}
		return amount;
	}
}
