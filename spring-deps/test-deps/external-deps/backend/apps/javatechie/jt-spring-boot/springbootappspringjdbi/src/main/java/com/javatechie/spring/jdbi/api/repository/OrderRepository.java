package com.javatechie.spring.jdbi.api.repository;

import com.javatechie.spring.jdbi.api.model.Order;
import org.skife.jdbi.v2.DBI;
import org.skife.jdbi.v2.Handle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;

@Repository
public class OrderRepository {

	private final DataSource dataSource;

	private OrderSQL orderSQL = null;

	public OrderRepository(@Qualifier("dataSource") DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@PostConstruct
	public void init() {
		Connection connection = DataSourceUtils.getConnection(dataSource);
		Handle handle = DBI.open(connection);
		orderSQL = handle.attach(OrderSQL.class);
	}

	public List<Order> findAllOrders() {
		return orderSQL.getOrders();
	}

	public Integer addOrder(Order order) {
		return orderSQL.addProduct(order);
	}

	public List<Order> getOrderByPrice(int price) {
		return orderSQL.getOrderByPrice(price);
	}

}
