package com.company.questions.wissen.eg04synchronized;

public class SynchronizedTester {
    public static void main(String[] args) {
        SynchronizedTester obj = new SynchronizedTester();
        A a1 = new A();
        A a2 = new A();
        new Thread(a1).start();
        new Thread(a2).start();
    }


}
class A implements Runnable {

    public void m1() throws InterruptedException {
        synchronized (A.class){
            Thread.sleep(1000);
        }
        System.out.println(Thread.currentThread().getName());
    }

    @Override
    public void run() {
        try {
            m1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}