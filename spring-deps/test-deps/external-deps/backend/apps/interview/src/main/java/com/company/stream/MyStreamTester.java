package com.company.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyStreamTester {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(9, 8, 2, 6, 3);

        numbers.stream().filter(i -> i % 2 != 0).forEach(System.out::println);
        System.out.println();

        List<Employee> employees = Employee.getEmployees();

        List<Employee> highSalaryEmployees = employees.stream().filter(e -> e.getSalary() > 500).collect(Collectors.toList());
        highSalaryEmployees.forEach(System.out::println);

        System.out.println();

        List<String> longNameEmployees = employees.stream().map(Employee::getEmpName).filter(name -> name.length() > 5).collect(Collectors.toList());
        longNameEmployees.forEach(System.out::println);

        System.out.println();

        List<Employee> sortedEmployees = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        sortedEmployees.forEach(System.out::println);

        System.out.println();

        Employee maxSalaryEmployee = employees.stream().max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("Max Salary Employee");
        System.out.println(maxSalaryEmployee);

        System.out.println();

        Employee minSalaryEmployee = employees.stream().min(Comparator.comparing(Employee::getSalary)).get();
        System.out.println("Min Salary Employee");
        System.out.println(minSalaryEmployee);

        System.out.println("\nUppercase Employees");
        List<String> uppercaseEmployees = employees.stream().map(Employee::getEmpName).map(String::toUpperCase).collect(Collectors.toList());
        uppercaseEmployees.forEach(System.out::println);

        System.out.println();
        System.out.println("IntStream range");
        IntStream.range(1, 11).forEach(System.out::println);

        System.out.println();
        System.out.println("IntStream range closed");
        IntStream.rangeClosed(1, 10).forEach(System.out::println);

        System.out.println();

        System.out.println();
        System.out.println("Stream Reduction");

        Integer sumOfAllElements = numbers.stream().reduce(0, (x, y) -> x + y);
        System.out.println(sumOfAllElements);

        // 10 + 1 + 2 + 3
        int reducedValueRange = IntStream.range(1, 4).reduce(10, (a, b) -> a + b);
        System.out.println(reducedValueRange);

        // 10 + 1 + 2 + 3 + 4 = 20
        int reducedValueRangeClosed = IntStream.rangeClosed(1, 4).reduce(10, (a, b) -> a + b);
        System.out.println(reducedValueRangeClosed);

        System.out.println(reducedValueRangeClosed);
    }

}
