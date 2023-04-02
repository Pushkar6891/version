package com.company.designpatterns.creational.singleton.cloning.solution;

import java.util.Objects;

public class Employee implements Cloneable {

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

    @Override
    protected Object clone() throws CloneNotSupportedException {
       // return super.clone();
        throw new CloneNotSupportedException("You cannot create clone of singleton");
    }
}
