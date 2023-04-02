package com.company.lambda;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LambdaExample {
    public static void main(String[] args) {
        log.info("Old Way of creating separate classes");
//        Sort sort = new MergeSort();
//        sort.sort();
//        sort = new QuickSort();
//        sort.sort();

        log.info("New Way of leveraging Lambda Expression ");
//        Sort sort = () -> System.out.println("MergeSort : sort()");
//        sort.sort();
//        sort = () -> System.out.println("QuickSort : sort()");
//        sort.sort();

        log.info("Lambda as method parameter i.e passing behaviour to a method");
        sort(() -> System.out.println("MergeSort : sort()"));
        sort(() -> System.out.println("QuickSort : sort()"));
    }

    private static void sort(Sort sort) {
        sort.sort();
    }
}

interface Sort {
    void sort();
}

class MergeSort implements Sort {

    @Override
    public void sort() {
        System.out.println("MergeSort : sort()");
    }
}

class QuickSort implements Sort {

    @Override
    public void sort() {
        System.out.println("QuickSort : sort()");
    }
}