package com.company.designpattern.creational.singleton.eg06singleton.serialization.problem;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static final long serialVersionUID = 1L;

    private static Singleton INSTANCE = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}