package com.company.codingquestions.codingques002;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTester {
    public static void main(String[] args) {
        StreamTester obj = new StreamTester();
        List<String> fruits = Arrays.asList("Apple", "Grape", "Banana", "Banana", "Apple");
        obj.printFruitCacheUsingLambda(fruits);
        System.out.println();
        obj.printFruitCacheUsingFunctionIdentity(fruits);
        System.out.println();
        obj.printFruitCacheUsingIterativeApproach(fruits);
    }

    private void printFruitCacheUsingLambda(List<String> fruits) {
        long start = System.currentTimeMillis();
        fruits.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " " + v));
        long end = System.currentTimeMillis();
        System.out.println("Total time : " + (end - start));
    }

    private void printFruitCacheUsingFunctionIdentity(List<String> fruits) {
        long start = System.currentTimeMillis();
        fruits.parallelStream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k, v) -> System.out.println(k + " " + v));
        long end = System.currentTimeMillis();
        System.out.println("Total time : " + (end - start));
    }

    private void printFruitCacheUsingIterativeApproach(List<String> fruits) {
        long start = System.currentTimeMillis();
        Map<String, Integer> fruitCache = new HashMap<>();
        for (String fruit : fruits) {
            if (fruitCache.containsKey(fruit)) {
                fruitCache.put(fruit, fruitCache.get(fruit) + 1);
            } else {
                fruitCache.put(fruit, 1);
            }
        }
        fruitCache.forEach((k, v) -> System.out.println(k + " " + v));
        long end = System.currentTimeMillis();
        System.out.println("Total time : " + (end - start));
    }
}
