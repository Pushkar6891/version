package com.company.javaeight.lambda;

public class RunnableLambdaExample {

    public static void main(String[] args) {
        RunnableLambdaExample obj = new RunnableLambdaExample();
        obj.beforeJava8();
        System.out.println("-------");
        obj.afterJava8();
        System.out.println("-------");
        obj.afterJava8WithMultipleStatements();
        System.out.println("-------");
    }

    /**
     * lot of boiler plate code
     */
    private void beforeJava8() {
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        Thread thread1 = new Thread(runnable1);
        thread1.start();
    }

    private void afterJava8() {
        Runnable runnable2 = () -> System.out.println("Inside Runnable 2");
        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }

    private void afterJava8WithMultipleStatements() {
        Runnable runnable2 = () -> {
            System.out.println("Inside Runnable Step 1");
            System.out.println("Inside Runnable Step 2");
        };
        Thread thread2 = new Thread(runnable2);
        thread2.start();
    }
}
