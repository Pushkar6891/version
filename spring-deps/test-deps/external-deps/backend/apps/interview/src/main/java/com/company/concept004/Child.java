package com.company.concept004;

public class Child extends Parent {

    public Child(){
        super();
        System.out.println("Child constructor");
    }

    void m1() {
        System.out.println("Inside Child m1()");
    }
}