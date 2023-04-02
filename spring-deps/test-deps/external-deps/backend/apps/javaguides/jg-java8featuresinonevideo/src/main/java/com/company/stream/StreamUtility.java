package com.company.stream;

import java.util.Arrays;
import java.util.List;

public class StreamUtility {
    public static List<Employee> getEmployees() {
        return Arrays.asList(
                new Employee(1, "Ramesh", 45, 1000.0),
                new Employee(7, "Suresh", 50, 200.0),
                new Employee(3, "Dinesh", 23, 1200.0),
                new Employee(5, "Mahesh", 44, 9000.0),
                new Employee(9, "Ganesh", 19, 1000.0)
        );
    }
}
