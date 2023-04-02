package com.msdw.aps.msfspe.helper;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyClass {

    private int nThreads = 5;

    public void execute(){
        ExecutorService es = Executors.newFixedThreadPool(nThreads);
    }
}
