package com.company;

public class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("MyTask::run() called");
    }
}
