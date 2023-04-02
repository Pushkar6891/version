package com.java8.eg0068;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Tester {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Davis", 30));
		empList.add(new Employee("Martin", 40));
		empList.add(new Employee("Alice", 23));
		empList.add(new Employee("Martin", 25));
		empList.add(new Employee("Barry", 34));
		empList.add(new Employee("Martin", 35));
		empList.add(new Employee("James", 45));

		System.out.println("\n1. Before Sort");
		empList.forEach(System.out::println);
		Comparator<Employee> comparator = Comparator.comparing(Employee::getName);

		System.out.println("\n2. After Sort");
		empList.sort(comparator);
		empList.forEach(System.out::println);
	}
}
