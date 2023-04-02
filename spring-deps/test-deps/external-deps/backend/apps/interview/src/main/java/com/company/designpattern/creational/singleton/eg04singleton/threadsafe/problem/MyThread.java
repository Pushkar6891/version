package com.company.designpattern.creational.singleton.eg04singleton.threadsafe.problem;

public class MyThread implements Runnable {

    @Override
    public void run() {
        Singleton INSTANCE = Singleton.getInstance();
        System.out.println(Thread.currentThread().getName() + " " + INSTANCE.hashCode());
    }
}
