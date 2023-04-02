package com.company.designpatterns.creational.singleton.lazy.solution;

public class MyThread implements Runnable {

    @Override
    public void run() {
        Employee employee = Employee.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + employee.hashCode());
    }
}
