package com.company.eg01.executorService;

class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread Name : " + Thread.currentThread().getName());
    }
}