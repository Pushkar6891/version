package com.company.designpatterns.creational.singleton.lazy.solution;

import java.util.Objects;

public class Employee {

    private static Employee EMPLOYEE = null;

    private Employee() {
    }

    /**
     * synchronized block reduces performance
     * it is overhead
     * @return
     */
    /*
    public static synchronized Employee getInstance() {
        if (Objects.isNull(EMPLOYEE)) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            EMPLOYEE = new Employee();
        }
        return EMPLOYEE;
    }
     */

    /**
     * using double check locking
     * we check twice whether instance is null or not
     * @return
     */
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
