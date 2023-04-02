package com.company.designpattern.creational.singleton.eg05singleton.reflection.solution01.usingEnum;

public enum Singleton {
    INSTANCE;

    public String greet(String name) {
        return "Hello " + name;
    }
}