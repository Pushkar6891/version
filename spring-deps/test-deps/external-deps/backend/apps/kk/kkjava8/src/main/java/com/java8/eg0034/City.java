package com.java8.eg0034;

import java.util.List;

public class City {

	private int id;
	private List<String> cities;

	public City(int id, List<String> cities) {
		super();
		this.id = id;
		this.cities = cities;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

}
