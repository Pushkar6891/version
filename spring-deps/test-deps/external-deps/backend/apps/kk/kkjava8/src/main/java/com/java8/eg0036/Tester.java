package com.java8.eg0036;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Tester {

	public static void main(String[] args) {

		List<String> list1 = new LinkedList<>();
		list1.add("Sachin");
		list1.add("Virat");
		list1.add("Rahul");

		System.out.println("1. Original List");
		list1.forEach(System.out::println);
		
		List<String> list2 = list1.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());

		System.out.println("\n2. Uppercase List");
		list2.forEach(System.out::println);
	}

}
