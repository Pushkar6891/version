package com.company.designpattern.creational.singleton.eg04singleton.threadsafe.solution01.staticSynchronized;

public class MyThread implements Runnable {

    @Override
    public void run() {
        Singleton INSTANCE = Singleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + INSTANCE.hashCode());
    }
}
