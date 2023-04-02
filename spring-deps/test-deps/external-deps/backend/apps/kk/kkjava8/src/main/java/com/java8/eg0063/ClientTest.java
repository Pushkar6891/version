package com.java8.eg0063;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Davis", 30));
		empList.add(new Employee("Alice", 23));
		empList.add(new Employee("Barry", 34));
		empList.add(new Employee("Martin", 35));
		empList.add(new Employee("James", 45));

		empList.forEach(System.out::println);
		System.out.println("-----------------------------------------------");
		// Comparator<Employee> comp = Comparator.comparing(Employee::getName);
		Comparator<Employee> comp = Comparator.comparing(Employee::getName, String.CASE_INSENSITIVE_ORDER);
		Collections.sort(empList, comp);

		empList.forEach(System.out::println);

	}

}