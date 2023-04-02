package com.java8.eg0078;

public class Employee {

	private int age;
	private String name;
	private String department;
	private Double salary;

	public Employee(int age, String name, String department, Double salary) {
		super();
		this.age = age;
		this.name = name;
		this.department = department;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}

}
