package com.company;

public class Product {

	private int price;
	private String name;

	public Product(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Product [price=" + price + ", name=" + name + "]";
	}
}
