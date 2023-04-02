package com.javatechie.spring.neo4j.api.node;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Node("Product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	private int id;
	private String name;
	private int qty;
	private double price;
}
