package com.javatechie.spring.jdbi.api.repository;

import com.javatechie.spring.jdbi.api.model.Order;
import org.skife.jdbi.v2.sqlobject.*;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import java.util.List;

@RegisterMapper(value = OrderMapper.class)
public interface OrderSQL {

	@SqlQuery("Select * from Order_TB")
	List<Order> getOrders();

	@SqlUpdate("insert into Order_TB (order_name,price,quantity,purchaseDate)"
			+ "value(:order_name,:price,:quantity,:purchaseDate)")
	@GetGeneratedKeys
	Integer addProduct(@BindBean Order order);

	@SqlQuery("SELECT * FROM Order_TB WHERE price = :price")
	List<Order> getOrderByPrice(@Bind("price") int price);

}
