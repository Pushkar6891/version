package com.company.questions.hcl.eg01ThreadUsingJava8;

public class ThreadTester {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
        };

        new Thread(runnable).start();

    }
}
