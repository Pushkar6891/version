package com.java8.eg0066;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ClientTest {

	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("Davis", 30));
		empList.add(new Employee("Martin", 40));
		empList.add(new Employee("Alice", 23));
		empList.add(new Employee("Martin", 25));
		empList.add(new Employee("Barry", 34));
		empList.add(new Employee("Martin", 35));
		empList.add(new Employee("James", 45));
		
		List<String> nameList = empList.stream().map(Employee::getName).collect(Collectors.toList());
		System.out.println("Before sorting..");
		nameList.forEach(System.out::println);
		//nameList.sort(Comparator.naturalOrder());
		nameList.sort(Comparator.reverseOrder());
		System.out.println("After sorting..");
		nameList.forEach(System.out::println);
		
	}

}