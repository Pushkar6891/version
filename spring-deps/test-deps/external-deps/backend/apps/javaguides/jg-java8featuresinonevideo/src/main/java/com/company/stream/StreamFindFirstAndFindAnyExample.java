package com.company.stream;

import java.util.List;
import java.util.Optional;

public class StreamFindFirstAndFindAnyExample {
    public static void main(String[] args) {
        List<Employee> employees = StreamUtility.getEmployees();

        Optional<Employee> findFirst = employees.stream().findFirst();
        if (findFirst.isPresent()) {
            System.out.println(findFirst.get());
        }

        Optional<Employee> any = employees.stream().findAny();
        if (any.isPresent()) {
            System.out.println(findFirst.get());
        }
    }
}
