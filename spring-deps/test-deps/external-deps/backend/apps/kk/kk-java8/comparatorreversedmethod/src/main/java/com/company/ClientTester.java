package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClientTester {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Davis", 30));
		empList.add(new Employee("Martin", 40));
		empList.add(new Employee("Alice", 23));
		empList.add(new Employee("Martin", 25));
		empList.add(new Employee("Barry", 34));
		empList.add(new Employee("Martin", 35));
		empList.add(new Employee("James", 45));
		
		Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);
		empList.sort(nameComparator);
		empList.forEach(System.out::println);
		System.out.println("----------------------------------------------");
		
		empList.sort(nameComparator.reversed());
		empList.forEach(System.out::println);
		
	}

}
