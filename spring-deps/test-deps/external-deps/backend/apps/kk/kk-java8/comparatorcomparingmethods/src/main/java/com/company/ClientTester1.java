package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClientTester1 {

	public static void main(String[] args) {

		List<Employee> empList1 = new ArrayList<>();
		empList1.add(new Employee("Davis", 30));
		empList1.add(new Employee("Alice", 23));
		empList1.add(new Employee("Barry", 34));
		empList1.add(new Employee("Martin", 35));
		empList1.add(new Employee("James", 45));

		empList1.forEach(System.out::println);
		System.out.println("-----------------------------------------------");
		Comparator<Employee> comparator1 = Comparator.comparing(Employee::getName);

		Collections.sort(empList1, comparator1);

		empList1.forEach(System.out::println);

	}

}