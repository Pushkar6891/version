package com.company;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class ClientTester {

	public static void main(String[] args) {

		List<Employee> list = new LinkedList<>();
		list.add(new Employee("A", 70000.00, "HR"));
		list.add(new Employee("B", 20000.00, "HR"));
		list.add(new Employee("C", 5000.00, "HR"));
		list.add(new Employee("D", 30000.00, "HR"));
		list.add(new Employee("W", 30000.00, "Finance"));
		list.add(new Employee("X", 20000.00, "Finance"));
		list.add(new Employee("Y", 10000.00, "Finance"));
		list.add(new Employee("Z", 90000.00, "Finance"));

		Comparator<Employee> salaryComparator = Comparator.comparing(Employee::getSalary);

		Map<String, Optional<Employee>> maxSalaryByDeptMap = list.stream().collect(Collectors
				.groupingBy(Employee::getDeptName, Collectors.reducing(BinaryOperator.maxBy(salaryComparator))));

		maxSalaryByDeptMap.forEach((deptName, emp) -> {
			System.out.println(deptName);
			System.out.println(emp.get());
		});

		System.out.println("-------------------------------");
		Map<String, Optional<Employee>> minSalaryByDeptMap = list.stream().collect(Collectors
				.groupingBy(Employee::getDeptName, Collectors.reducing(BinaryOperator.minBy(salaryComparator))));

		minSalaryByDeptMap.forEach((deptName, emp) -> {
			System.out.println(deptName);
			System.out.println(emp.get());
		});
	}

}
