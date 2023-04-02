package com.company.lambda;

public class RunnableLambdaExample {
    public static void main(String[] args) {
//        Thread thread = new Thread(new Task());
//        thread.start();

//        Runnable runnable = () -> System.out.println("run() called");
//        Thread thread = new Thread(runnable);
//        thread.start();

        Thread thread = new Thread(() -> System.out.println("run() called"));
        thread.start();
    }
}

class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("run() called");
    }
}
