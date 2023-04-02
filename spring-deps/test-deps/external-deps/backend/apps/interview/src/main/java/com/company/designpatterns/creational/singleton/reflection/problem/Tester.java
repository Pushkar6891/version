package com.company.designpatterns.creational.singleton.reflection.problem;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Tester {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {

        Employee employee1 = Employee.getInstance();
        Employee employee2 = null;

        Constructor<?>[] declaredConstructors = Employee.class.getDeclaredConstructors();
        for (Constructor<?> constructor : declaredConstructors) {
            constructor.setAccessible(true);
            Object object = constructor.newInstance();
            employee2 = (Employee) object;
            break;
        }

        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
    }
}