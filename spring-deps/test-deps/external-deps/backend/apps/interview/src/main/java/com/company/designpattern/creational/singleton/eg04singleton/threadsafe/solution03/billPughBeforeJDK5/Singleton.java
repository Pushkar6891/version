package com.company.designpattern.creational.singleton.eg04singleton.threadsafe.solution03.billPughBeforeJDK5;

public class Singleton {

    private Singleton() {

    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
}
