package com.company;

import java.util.ArrayList;
import java.util.List;

public class ClientTester {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Davis", 30));
		empList.add(new Employee("Alice", 23));
		empList.add(new Employee("Barry", 34));
		empList.add(new Employee("Martin", 35));
		empList.add(new Employee("James", 45));

		System.out.println("Before Sorting...................");
		empList.forEach(System.out::println);

		empList.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));

		System.out.println("After Sorting...................");
		empList.forEach(System.out::println);
	}

}