package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ClientTester {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Sean", "sean.m@gmail.com", 90000.00));
		empList.add(new Employee("Andrew", "andy.cs@gmail.com", 70000.00));
		empList.add(new Employee("Martin", "martin.m300@gmail.com", 80000.00));

		sort1(empList);
		sort2(empList);

		empList.add(new Employee("Ajay", "ajay@gmail.com", 20000.00));
		empList.add(new Employee("Vijay", "vijay@gmail.com", 30000.00));

		sort3(empList);

		empList.add(new Employee("Vivek", "vivek@gmail.com", 10000.00));
		empList.add(new Employee("Sam", "sam@gmail.com", 50000.00));

		sort4(empList);

	}

	private static void sort1(List<Employee> empList) {
		System.out.println("List of employee before sorting..");
		empList.forEach(System.out::println);
	}

	private static void sort2(List<Employee> empList) {
		Collections.sort(empList, new EmployeeNameSorter());

		System.out.println("--------------------------------------------");
		System.out.println("List of employee after sorting..");
		empList.forEach(System.out::println);
	}

	private static void sort3(List<Employee> empList) {
		Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		System.out.println("--------------------------------------------");
		System.out.println("List of employee after sorting..");
		empList.forEach(System.out::println);
	}

	private static void sort4(List<Employee> empList) {
		Collections.sort(empList, (e1, e2) -> e1.getName().compareTo(e2.getName()));

		System.out.println("--------------------------------------------");
		System.out.println("List of employee after sorting..");
		empList.forEach(System.out::println);
	}
}
