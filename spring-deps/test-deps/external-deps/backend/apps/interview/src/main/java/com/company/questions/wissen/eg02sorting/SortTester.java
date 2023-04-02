package com.company.questions.wissen.eg02sorting;

import java.util.*;

public class SortTester {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Zeenat");
        Employee emp2 = new Employee(5, "Praveen");
        Employee emp3 = new Employee(3, "gauri");
        Employee emp4 = new Employee(8, "zoya");
        Employee emp5 = new Employee(9, "Geeta");
        Employee emp6 = new Employee(10, "Mayuri");

        List<Employee> list = new LinkedList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        list.add(emp6);

        list.forEach(System.out::println);

        System.out.println();

        // Collections.sort(list, (e1, e2) -> e1.getName().compareTo(e2.getName()));
        // list.sort((e1, e2) -> e1.getName().compareTo(e2.getName()));

        Comparator<Employee> employeeAscNameComparator = (e1, e2) -> e1.getName().compareTo(e2.getName());
        Comparator<Employee> employeeDescNameComparator = (e1, e2) -> e1.getName().compareTo(e2.getName());
        list.stream().sorted(employeeAscNameComparator.reversed()).forEach(System.out::println);

        // list.forEach(System.out::println);
    }
}