package com.java8.eg0003;

public class Employee implements Comparable<Employee> {

	private long id;
	private String name;
	private int age;

	public Employee(long id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int compareTo(Employee employee) {
		return this.name.compareTo(employee.name);
	}

}
