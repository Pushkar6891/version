package com.company.designpattern.creational.singleton.eg07singleton.cloning.problem;

public class SingletonTester {
    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = (Singleton) singleton2.clone();
        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());
        System.out.println(singleton3.hashCode());

    }
}
