package com.company.designpattern.creational.singleton.eg07singleton.cloning.solution;

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
        throw new CloneNotSupportedException("Singleton Class Objects cannot be cloned");
        // return super.clone();
    }
}