package com.bharath.springboot.reactive;

public class Product {

	private String name;

	public Product(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
