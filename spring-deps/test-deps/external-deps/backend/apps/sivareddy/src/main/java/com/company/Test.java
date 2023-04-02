package com.company;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Test obj = new Test();
        List<Employee> employees = obj.getEmployees();

        // Write a program to print employee details working in each department
        Map<Integer, List<Employee>> empListBasedOnDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId, Collectors.toList()));

        empListBasedOnDept.entrySet().forEach(System.out::println);

        System.out.println("--------------------------");

        // Write a program to print employees count working in each department
        Map<Integer, Long> empCountDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDeptId, Collectors.counting()));

        empCountDept.entrySet().forEach(System.out::println);

        System.out.println("--------------------------");

        // Write a program to print active and inactive employees in the given collection
        long activeCount = employees.stream().filter(e -> "active".equals(e.getStatus())).count();
        long inactiveCount = employees.stream().filter(e -> "active".equals(e.getStatus())).count();

        System.out.println("Active : " + activeCount);
        System.out.println("Inactive : " + inactiveCount);

        System.out.println("--------------------------");
        
        // Write a program to print Max/Min employee salary from the given collection
        Optional<Employee> maxSalaryEmployee = employees.stream().max(Comparator.comparingInt(Employee::getSalary));
        Optional<Employee> minSalaryEmployee = employees.stream().min(Comparator.comparingInt(Employee::getSalary));

        System.out.println("Max Salary Employee : " + maxSalaryEmployee);
        System.out.println("Min Salary Employee : " + minSalaryEmployee);

        System.out.println("--------------------------");
        
        // Write a program to print the max salary of an employee from each department
        Map<Integer, Optional<Employee>> topSalaryEmployeeDepartmentwise = employees.stream().collect(Collectors.groupingBy(Employee::getDeptId, Collectors.reducing(BinaryOperator.maxBy(Comparator.comparingInt(Employee::getSalary)))));
        topSalaryEmployeeDepartmentwise.entrySet().forEach(System.out::println);

        System.out.println("--------------------------");
    }

    private List<Employee> getEmployees(){
        return List.of(
                new Employee(107,"Pushkar",103,"active",5000),
                new Employee(103,"Ramakant",102,"active",8000),
                new Employee(101,"Ankita",100,"active",1000),
                new Employee(100,"Amit",102,"inactive",7000),
                new Employee(109,"Zuby",101,"inactive",9000),
                new Employee(102,"Vivek",100,"inactive",5000)
        );
    }
}

// https://www.youtube.com/watch?v=1pweZskNq7w&t=6s