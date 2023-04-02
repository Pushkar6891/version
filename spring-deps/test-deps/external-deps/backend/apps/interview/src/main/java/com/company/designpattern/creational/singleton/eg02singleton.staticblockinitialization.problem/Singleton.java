package com.company.designpattern.creational.singleton.eg02singleton.staticblockinitialization.problem;

public class Singleton {
    private static Singleton INSTANCE = null;

    private Singleton() {
    }

    static {
        try {
            if (INSTANCE == null) {
                INSTANCE = new Singleton();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }
}