package com.java8.eg0030;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamTester {

	public static void main(String[] args) {

		List<Employee> list = new LinkedList<>();
		list.add(new Employee(124, "Sachin", 1000.0));
		list.add(new Employee(120, "Virat", 500.0));
		list.add(new Employee(100, "Rahul", 2000.0));
		list.add(new Employee(106, "Anjum", 5000.0));
		list.add(new Employee(110, "Jhoolan", 3000.0));

		System.out.println("1. Original List");
		list.forEach(System.out::println);

		Stream<Employee> parallelStream = list.parallelStream();
		System.out.println("\n2. Employee data sent for processing");
		parallelStream.forEach(e -> doProcess(e));
	}

	public static void doProcess(Employee employee) {
		System.out.println(employee);
	}

}
