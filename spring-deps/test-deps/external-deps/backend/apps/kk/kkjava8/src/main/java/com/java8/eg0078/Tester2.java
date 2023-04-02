package com.java8.eg0078;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tester2 {

	public static void main(String[] args) {

		Employee viratObj = new Employee(30, "Virat", "Top Order Batsman", 2000.0);
		Employee abdObj = new Employee(32, "ABD", "Top Order Batsman", 1000.0);

		Employee parthivObj = new Employee(29, "Parthiv", "Wicket Keeper Batsman", 500.0);
		Employee umeshObj = new Employee(32, "Umesh", "Fast Bowler", 800.0);
		Employee washingtonObj = new Employee(28, "Washington", "Spin Bowler", 400.0);

		List<Employee> permanentList = new LinkedList<>();
		permanentList.add(viratObj);
		permanentList.add(abdObj);

		List<Employee> temporaryList = new LinkedList<>();
		temporaryList.add(parthivObj);
		temporaryList.add(umeshObj);
		temporaryList.add(washingtonObj);

		List<List<Employee>> allEmployeeList = new LinkedList<>();
		allEmployeeList.add(permanentList);
		allEmployeeList.add(temporaryList);

		System.out.println("1. Permanent List");
		permanentList.forEach(System.out::println);

		System.out.println("\n2. Temporary List");
		temporaryList.forEach(System.out::println);

//		System.out.println("\n3. Using FlatMap to Print all members");
//		Stream<Employee> flatMap = allEmployeeList.stream().flatMap(e -> e.stream());
//		flatMap.forEach(System.out::println);
//
//		// cannot reuse stream
//		System.out.println("\n4. Using FlatMap to Print all members");
//		Stream<Employee> flatMap2 = allEmployeeList.stream().flatMap(List::stream);
//		flatMap2.forEach(System.out::println);

		// cannot reuse stream
		System.out.println("\n4. Using forEach to Find all members names");
		allEmployeeList.forEach((list) -> {
			List<String> nameList = list.stream().map(e -> e.getName()).collect(Collectors.toList());
			nameList.forEach(System.out::println);
		});
		
		System.out.println("\n4. Using forEach to Find all members age");
		allEmployeeList.forEach((list) -> {
			List<Integer> ageList = list.stream().map(e -> e.getAge()).collect(Collectors.toList());
			ageList.forEach(System.out::println);
		});

	}

}
