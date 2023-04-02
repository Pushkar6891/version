package com.javatechie.spring.exp.handle.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.spring.exp.handle.api.model.Order;

public interface OrderDAO extends JpaRepository<Order, Integer>{

	Order findByName(String name);

}
