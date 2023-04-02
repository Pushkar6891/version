package com.company.designpatterns.creational.singleton.billpugh;

public class Employee {

    private Employee() {
    }

    private static class SingletonHolder {
        private static final Employee EMPLOYEE = new Employee();
    }

    public static Employee getInstance() {
        return SingletonHolder.EMPLOYEE;
    }
}
