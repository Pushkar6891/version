package com.company.stream;

import java.util.List;

public class StreamDemo {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployees();

        employees.stream()
                .filter(e -> e.getSalary() > 500)
                .map(e -> e.getEmpName().toUpperCase())
                .forEach(System.out::println);
    }
}
