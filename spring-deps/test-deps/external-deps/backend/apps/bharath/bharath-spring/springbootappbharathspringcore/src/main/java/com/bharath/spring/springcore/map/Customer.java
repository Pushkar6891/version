package com.bharath.spring.springcore.map;

import java.util.Map;

public class Customer {
	private int id;
	private Map<Integer, String> products;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<Integer, String> getProducts() {
		return products;
	}

	public void setProducts(Map<Integer, String> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", products=" + products + "]";
	}

	
}
