package com.company.designpatterns.creational.singleton.reflection.problem;

import java.util.Objects;

public class Employee {

    private static Employee EMPLOYEE = null;

    private Employee() {
    }


    public static Employee getInstance() {
        if (Objects.isNull(EMPLOYEE)) {
            // class level lock
            synchronized (Employee.class) {
                if (Objects.isNull(EMPLOYEE)) {
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    EMPLOYEE = new Employee();
                }
            }
        }
        return EMPLOYEE;
    }

}
