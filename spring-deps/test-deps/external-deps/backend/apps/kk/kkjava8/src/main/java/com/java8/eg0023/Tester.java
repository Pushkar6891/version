package com.java8.eg0023;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;

// reference to instance method of arbitrary object
public class Tester {

	public static void main(String[] args) {

		List<Employee> employees = new LinkedList<>();
		employees.add(new Employee(1, "Sachin", 2000.0));
		employees.add(new Employee(3, "Rahul", 1000.0));
		employees.add(new Employee(2, "Virat", 1500.0));

		System.out.println("1. Employees : ");
		employees.forEach(System.out::println);

		List<String> employeeNames = Tester.getEmployeeName(employees, Employee::getName);

		System.out.println("\n2. Employees Names: ");
		employeeNames.forEach(System.out::println);

	}

	public static List<String> getEmployeeName(List<Employee> employees, Function<Employee, String> f) {
		List<String> employeeNames = new LinkedList<>();
		employees.forEach(e -> employeeNames.add(f.apply(e)));
		return employeeNames;
	}

}
