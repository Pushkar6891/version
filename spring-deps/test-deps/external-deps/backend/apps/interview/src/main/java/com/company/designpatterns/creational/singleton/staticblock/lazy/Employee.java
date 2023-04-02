package com.company.designpatterns.creational.singleton.staticblock.lazy;

public class Employee {

    private static Employee EMPLOYEE = null;

    private Employee() {
    }

    static {
        try {
            EMPLOYEE = new Employee();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Employee getInstance() {
        return EMPLOYEE;
    }
}
