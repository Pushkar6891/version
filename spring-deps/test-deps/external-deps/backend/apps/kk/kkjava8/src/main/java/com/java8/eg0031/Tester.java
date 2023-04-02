package com.java8.eg0031;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Tester {

	public static void main(String[] args) {

		List<Employee> list = new LinkedList<>();
		list.add(new Employee(124, "Sachin", 1000.0));
		list.add(new Employee(120, "Virat", 500.0));
		list.add(new Employee(100, "Rahul", 2000.0));
		list.add(new Employee(106, "Anjum", 5000.0));
		list.add(new Employee(110, "Jhoolan", 3000.0));

		System.out.println("1. Original List");
		list.forEach(System.out::println);

		// 1. Using Intermediate Stream Operation
//		System.out.println("\n2. Using Intermediate Stream");
//		Stream<Employee> stream = list.stream();
//		Stream<Employee> distinct = stream.distinct();
//		long count1 = distinct.count();
//		System.out.println(count1);

		// 2. Using Terminal Stream or Chaining Operation
//		System.out.println("\n3. Using Terminal Stream");
//		long count2 = list.stream().distinct().count();
//		System.out.println(count2);

		boolean anyMatch = list.stream().anyMatch(s -> s.getName().contains("ra"));
		System.out.println(anyMatch);
	}

}
