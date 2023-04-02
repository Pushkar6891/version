package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClientTester4 {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Davis", 30));
		empList.add(new Employee("Martin", 40));
		empList.add(new Employee("Alice", 23));
		empList.add(new Employee("Martin", 25));
		empList.add(new Employee("Barry", 34));
		empList.add(new Employee("Martin", 35));
		empList.add(new Employee("James", 45));

		System.out.println("Before Sorting...............");

		empList.forEach(System.out::println);

		Comparator<Employee> comp = Comparator.comparing(Employee::getName).thenComparing(Employee::getAge);
		Collections.sort(empList, comp);
		System.out.println("After Sorting...............");
		empList.forEach(System.out::println);
	}

}