package com.javatechie.spring.neo4j.api.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.neo4j.api.node.Customer;
import com.javatechie.spring.neo4j.api.node.Product;
import com.javatechie.spring.neo4j.api.repository.CustomerRepository;

@RestController
public class OMSController {
	@Autowired
	private CustomerRepository repository;

	@PostConstruct
	public void purchaseOrder() {
		List<Product> products = new ArrayList<>();
		products.add(new Product(101, "IPhone", 2, 200000));
		products.add(new Product(102, "Macbook Pro M1", 3, 300000));
		Customer customer = new Customer();
		customer.setCid(444);
		customer.setName("Pushkar");
		customer.setAddress(new String[] { "Indore", "Bangalore" });
		customer.setProducts(products);
		repository.save(customer);
	}

	@GetMapping("/getOrders")
	public List<Customer> getPurchaseOrder() {
		return (List<Customer>) repository.findAll();
	}

	@GetMapping("/getInfo/{name}")
	public Customer getInfo(@PathVariable String name) {
		return repository.findByName(name);
	}
}
