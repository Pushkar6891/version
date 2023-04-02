package com.company.stream;

import java.util.List;
import java.util.stream.Collectors;

public class MyStreamDemo {

    public static void main(String[] args) {

        List<Employee> employees = Employee.getEmployees();
        employees.forEach(System.out::println);

        System.out.println();

        List<Employee> employeesWithSalaryIncrement = employees.stream()
                .map(e -> {
                    if (e.getAge() > 30) {
                        e.setSalary(e.getSalary() * 1.10);
                    }
                    return e;
                })
                .collect(Collectors.toList());

        employeesWithSalaryIncrement.forEach(System.out::println);

    }
}
