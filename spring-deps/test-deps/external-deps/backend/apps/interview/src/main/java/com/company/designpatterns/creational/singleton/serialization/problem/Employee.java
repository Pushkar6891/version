package com.company.designpatterns.creational.singleton.serialization.problem;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    private static Employee EMPLOYEE = null;

    private Employee() {
    }

    /**
     * using double check locking
     * we check twice whether instance is null or not
     *
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
