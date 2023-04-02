package com.company.questions.lnt.eg03Treeset;

import java.util.Set;
import java.util.TreeSet;

public class TreesetTester {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Zeenat", 90.0);
        Employee emp2 = new Employee(5, "Praveen", 80.0);
        Employee emp3 = new Employee(3, "gauri", 78.0);
        Employee emp4 = new Employee(8, "zoya", 45.0);
        Employee emp5 = new Employee(9, "Geeta", 88.0);
        Employee emp6 = new Employee(10, "Mayuri", 23.0);

        Set<Employee> set = new TreeSet<>();
        set.add(emp1);
        set.add(emp2);
        set.add(emp3);
        set.add(emp4);
        set.add(emp5);
        set.add(emp6);

        set.forEach(System.out::println);
    }
}
// ClassCastException if no Comparable