package com.company.designpattern.creational.singleton.eg05singleton.reflection.solution01.usingEnum;

public class SingletonTester {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        System.out.println(singleton1.greet("Pushkar"));
        System.out.println(singleton2.greet("Pushkar"));
    }
}
