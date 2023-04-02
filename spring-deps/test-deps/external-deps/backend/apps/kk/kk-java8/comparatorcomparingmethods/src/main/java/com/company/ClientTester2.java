package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClientTester2 {

	public static void main(String[] args) {

		List<Employee> empList2 = new ArrayList<>();
		empList2.add(new Employee("Davis", 30));
		empList2.add(new Employee("Alice", 23));
		empList2.add(new Employee("Barry", 34));
		empList2.add(new Employee("Martin", 35));
		empList2.add(new Employee("James", 45));

		Comparator<Employee> comparator2 = Comparator.comparing(Employee::getName, String.CASE_INSENSITIVE_ORDER);

		Collections.sort(empList2, comparator2);

		empList2.forEach(System.out::println);

	}

}