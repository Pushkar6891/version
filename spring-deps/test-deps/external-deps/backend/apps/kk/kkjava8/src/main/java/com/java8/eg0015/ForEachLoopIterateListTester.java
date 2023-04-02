package com.java8.eg0015;

import java.util.LinkedList;
import java.util.List;

public class ForEachLoopIterateListTester {

	public static void main(String[] args) {

		List<Employee> empList = new LinkedList<>();
		empList.add(new Employee(1, "Sachin"));
		empList.add(new Employee(3, "Rahul"));
		empList.add(new Employee(2, "Virat"));

		// 1. Using foreach
		empList.forEach(e -> System.out.println(e));

		System.out.println();
		
		// 2. Using foreach with Method Reference
		empList.forEach(System.out::println);

	}
}
