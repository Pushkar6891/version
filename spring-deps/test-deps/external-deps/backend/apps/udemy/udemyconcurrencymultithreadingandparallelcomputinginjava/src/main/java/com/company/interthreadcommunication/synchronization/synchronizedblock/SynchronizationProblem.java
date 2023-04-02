package com.company.interthreadcommunication.synchronization.synchronizedblock;
// using synchronized keyword acquires intrinsic lock / monitor of class so other
// synchronized methods existing in same class are unable to execute at same time

// every object has a single monitor lock
public class SynchronizationProblem {
    public static int counter1 = 0;
    public static int counter2 = 0;

    public static synchronized void increment1(){
        counter1++;
    }

    public static synchronized void increment2(){
        counter2++;
    }

    public static void process() throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                increment1();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                increment2();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Counter1 : " + counter1);
        System.out.println("Counter2 : " + counter2);
    }

    public static void main(String[] args) throws InterruptedException {
        process();
    }
}
