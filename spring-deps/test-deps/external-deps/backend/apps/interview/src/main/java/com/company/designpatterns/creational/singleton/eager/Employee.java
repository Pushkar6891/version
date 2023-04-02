package com.company.designpatterns.creational.singleton.eager;

public class Employee {

    private static final Employee EMPLOYEE = new Employee();

    private Employee() {
    }

    public static Employee getInstance() {
        return EMPLOYEE;
    }
}
