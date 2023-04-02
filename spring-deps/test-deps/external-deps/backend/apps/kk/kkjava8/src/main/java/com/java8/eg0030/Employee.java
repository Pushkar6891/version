package com.java8.eg0030;

public class Employee {

	private int age;
	private String name;
	private Double salary;

	public Employee(int age, String name, Double salary) {
		super();
		this.age = age;
		this.name = name;
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", salary=" + salary + "]";
	}

}
