package com.company.designpattern.creational.singleton.eg00singleton.perfectSingleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

    private static final long SerialVersionUID=10l;
    private static volatile Singleton INSTANCE = null;

    private Singleton() {
        System.out.println("Creating Singleton Object");
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            synchronized (Singleton.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }

    protected Object readResolve() {
        return INSTANCE;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("You cannot create a clone of Singleton Class");
    }
}