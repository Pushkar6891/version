package com.company.stream;

import java.util.Comparator;
import java.util.List;

public class StreamAggregateExample {
    public static void main(String[] args) {
        List<Employee> employees = StreamUtility.getEmployees();

        Employee minSalaryEmployee = employees.stream().min(Comparator.comparingDouble(Employee::getSalary)).get();
        System.out.println(minSalaryEmployee);

        Employee maxSalaryEmployee = employees.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
        System.out.println(maxSalaryEmployee);

        long count = employees.stream().count();
        System.out.println(count);
    }
}
