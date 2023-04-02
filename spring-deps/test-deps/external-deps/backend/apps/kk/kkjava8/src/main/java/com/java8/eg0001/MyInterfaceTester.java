package com.java8.eg0001;

import java.util.LinkedList;
import java.util.List;

public class MyInterfaceTester {

	public static void main(String[] args) {

		MyInterface myInterface = new MyClass();

		List<Employee> empList = new LinkedList<>();
		empList.add(new Employee(100, "Sachin", 40));
		empList.add(new Employee(105, "Virat", 20));
		empList.add(new Employee(102, "Rahul", 20));
		empList.add(new Employee(108, "Ashish", 35));
		empList.add(new Employee(103, "Anjum", 30));

		List<Employee> sortEmployees = myInterface.sortEmployees(empList);

		for (Employee employee : sortEmployees) {
			System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getAge());
		}
	}

}
