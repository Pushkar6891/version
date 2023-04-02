package com.company.designpattern.creational.singleton.eg04singleton.threadsafe.solution01.staticSynchronized;

public class Singleton {
    private static Singleton INSTANCE = null;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
