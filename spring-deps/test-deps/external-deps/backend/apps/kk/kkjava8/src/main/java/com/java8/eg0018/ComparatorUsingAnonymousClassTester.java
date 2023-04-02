package com.java8.eg0018;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ComparatorUsingAnonymousClassTester {

	public static void main(String[] args) {

		List<Employee> empList = new LinkedList<>();
		empList.add(new Employee(1, "Sachin", 2000.0));
		empList.add(new Employee(3, "Rahul", 1000.0));
		empList.add(new Employee(2, "Virat", 1500.0));

		System.out.println("1. Before Sort");
		empList.forEach(System.out::println);

		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		});

		System.out.println("2. After Sort");
		empList.forEach(System.out::println);
	}
}
