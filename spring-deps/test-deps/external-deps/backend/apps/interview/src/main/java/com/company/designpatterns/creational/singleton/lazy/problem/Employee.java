package com.company.designpatterns.creational.singleton.lazy.problem;

import java.util.Objects;

public class Employee {

    private static Employee EMPLOYEE = null;

    private Employee() {
    }

    public static Employee getInstance() {
        if (Objects.isNull(EMPLOYEE)) {
            EMPLOYEE = new Employee();
        }
        return EMPLOYEE;
    }
}
