package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientTester {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student("PK", 23));
		list.add(new Student("KK", 26));
		list.add(new Student("MK", 23));
		list.add(new Student("SK", 21));
		list.add(new Student("RK", 40));
		list.add(new Student("BK", 30));
		list.add(new Student("DK", 80));

		Stream<Student> filteredList = list.stream().filter(s -> s.getAge() > 25);
		filteredList.forEach(System.out::println);

		System.out.println("-------------------");

		boolean allMatch = list.stream().allMatch(s -> s.getName().contains("K"));
		System.out.println(allMatch);

		System.out.println("-------------------");
		boolean anyMatch = list.stream().anyMatch(s -> s.getAge() > 35);
		System.out.println(anyMatch);
		System.out.println("-------------------");
		boolean noneMatch = list.stream().noneMatch(s -> s.getAge() > 55);
		System.out.println(noneMatch);
	}

}
