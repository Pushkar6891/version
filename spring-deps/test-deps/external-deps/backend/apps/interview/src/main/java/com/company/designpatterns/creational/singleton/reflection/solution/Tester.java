package com.company.designpatterns.creational.singleton.reflection.solution;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Tester {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        Employee employee1 = Employee.INSTANCE;
        Employee employee2 = Employee.INSTANCE;

        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());

        System.out.println(employee1.greet("Pushkar"));
        System.out.println(employee1.greet("Amit"));
    }
}