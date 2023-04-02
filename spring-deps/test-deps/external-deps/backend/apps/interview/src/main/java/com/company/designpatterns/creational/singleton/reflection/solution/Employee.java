package com.company.designpatterns.creational.singleton.reflection.solution;

public enum Employee {

    INSTANCE;

    public String greet(String name) {
        return "Good Morning " + name;
    }
}
