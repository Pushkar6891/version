package com.java8.eg0033;

import java.util.LinkedList;
import java.util.List;

public class Tester {

	public static void main(String[] args) {

		List<Employee> list = new LinkedList<>();
		list.add(new Employee(24, "Sachin", 1000.0));
		list.add(new Employee(20, "Virat", 500.0));
		list.add(new Employee(10, "Rahul", 2000.0));
		list.add(new Employee(16, "Anjum", 5000.0));
		list.add(new Employee(11, "Jhoolan", 3000.0));

		System.out.println("1. Original List");
		list.forEach(System.out::println);

		System.out.println("\n 2. Matching Operations : Is there any name containing 'a' ? ");
		boolean allMatch = list.stream().allMatch(s -> s.getName().contains("a"));
		System.out.println(allMatch);

		System.out.println("\n 3. Matching Operations : Is there any one with age > 20 ? ");
		boolean anyMatch = list.stream().anyMatch(s -> s.getAge() > 20);
		System.out.println(anyMatch);

		System.out.println("\n 4. Matching Operations : Is none of the elements age > 65 ? ");
		boolean noneMatch = list.stream().noneMatch(s -> s.getAge() > 65);
		System.out.println(noneMatch);

	}

}
