package com.company.designpatterns.creational.singleton.billpugh;

public class Tester {
    public static void main(String[] args) {
        Employee employee1 = Employee.getInstance();
        Employee employee2 = Employee.getInstance();

        System.out.println("Employee1 hashCode : " + employee1.hashCode());
        System.out.println("Employee2 hashCode : " + employee2.hashCode());
    }
}
