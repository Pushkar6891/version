package com.company.sequentialprocessing;

public class Tester {
    public static void main(String[] args) {
        MyTask1 myTask1 = new MyTask1();
        MyTask2 myTask2 = new MyTask2();
        myTask1.execute();
        myTask2.execute();
    }
}
