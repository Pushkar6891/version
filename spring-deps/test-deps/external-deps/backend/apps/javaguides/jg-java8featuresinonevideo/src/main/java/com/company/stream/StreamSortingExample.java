package com.company.stream;

import java.util.Comparator;

public class StreamSortingExample {
    public static void main(String[] args) {
//        Comparator<Employee> nameComparator = (e1, e2) -> e1.getName().compareTo(e2.getName());
//        Comparator<Employee> ageComparator = (e1,e2) ->  e1.getAge() - e2.getAge();
//        Comparator<Employee> salaryComparator = (e1,e2) -> (int) (e1.getSalary() - e2.getSalary());

        Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName);
        Comparator<Employee> ageComparator = Comparator.comparingInt(Employee::getAge);
        Comparator<Employee> idComparator = Comparator.comparingLong(Employee::getId);
        Comparator<Employee> salaryComparator = (e1,e2) -> (int) (e1.getSalary() - e2.getSalary());

        System.out.println("Name :");
        StreamUtility.getEmployees().stream().sorted(nameComparator).forEach(System.out::println);

        System.out.println("Name Reversed :");
        StreamUtility.getEmployees().stream().sorted(nameComparator.reversed()).forEach(System.out::println);

        System.out.println("Age :");
        StreamUtility.getEmployees().stream().sorted(ageComparator).forEach(System.out::println);

        System.out.println("Id :");
        StreamUtility.getEmployees().stream().sorted(idComparator).forEach(System.out::println);

        System.out.println("Salary :");
        StreamUtility.getEmployees().stream().sorted(salaryComparator).forEach(System.out::println);
    }
}
