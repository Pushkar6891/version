package com.company.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static void main(String[] args) {
        List<Employee> youngEmployees = StreamUtility.getEmployees().stream().filter(employee -> employee.getAge() < 30).collect(Collectors.toList());
        youngEmployees.forEach(System.out::println);
    }
}


