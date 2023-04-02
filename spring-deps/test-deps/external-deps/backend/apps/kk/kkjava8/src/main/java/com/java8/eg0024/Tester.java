package com.java8.eg0024;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

// reference to instance method of particular object
public class Tester {

	public static void main(String[] args) {

		List<Employee> employees = new LinkedList<>();
		employees.add(new Employee(1, "Sachin", 2000.0));
		employees.add(new Employee(3, "Rahul", 1000.0));
		employees.add(new Employee(2, "Virat", 1500.0));

		// using lambda
		employees.forEach(e -> System.out.println(e));
		
		// method reference
		employees.forEach(System.out::println);
	}

}
