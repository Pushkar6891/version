package com.company.designpattern.creational.singleton.eg05singleton.reflection.problem;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTester {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = null;
        Constructor<?>[] constructors = Singleton.class.getDeclaredConstructors();
        for(Constructor constructor : constructors){
            constructor.setAccessible(true);
            Object obj = constructor.newInstance();
            singleton2 = (Singleton) obj;
            break;
        }

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
    }
}
