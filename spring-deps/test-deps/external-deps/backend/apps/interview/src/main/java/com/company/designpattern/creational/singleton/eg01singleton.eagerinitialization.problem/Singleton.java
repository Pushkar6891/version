package com.company.designpattern.creational.singleton.eg01singleton.eagerinitialization.problem;

public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}