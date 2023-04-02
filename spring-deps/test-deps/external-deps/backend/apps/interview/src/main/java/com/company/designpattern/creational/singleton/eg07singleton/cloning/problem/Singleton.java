package com.company.designpattern.creational.singleton.eg07singleton.cloning.problem;

public class Singleton implements Cloneable {

    private static Singleton INSTANCE = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}