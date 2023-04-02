package com.company.functionalinterface;

@FunctionalInterface
public interface MyFunctionalInterface {
    void print(String message);

    // void display();

    default void m1() {
        System.out.println("default method : m1()");
    }

    static void m2() {
        System.out.printf("static method : m2()");
    }
}
