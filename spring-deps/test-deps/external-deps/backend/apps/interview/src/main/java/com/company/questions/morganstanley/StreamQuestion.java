package com.company.questions.morganstanley;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamQuestion {
    public static void main(String[] args) {
        StreamQuestion obj = new StreamQuestion();
        List<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grapes");
        fruits.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting())).forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println();
        fruits.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).forEach((k, v) -> System.out.println(k + " " + v));
        System.out.println();
        obj.display(fruits);
    }

    private void display(List<String> fruits) {
        HashMap<String, Integer> fruitsCache = new HashMap<>();
        for (int i = 0; i < fruits.size(); i++) {
            String fruit = fruits.get(i);
            if (fruitsCache.containsKey(fruit)) {
                fruitsCache.put(fruit, fruitsCache.get(fruit) + 1);
            } else {
                fruitsCache.put(fruit, 1);
            }
        }
        System.out.println(fruitsCache);
    }
}
