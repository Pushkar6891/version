package Abstraction;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Tester {

    public static void main(String[] args) {
        Tester obj = new Tester();
        List<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Grape");
        obj.displayUsingInterview(fruits);
        obj.displayUsingImperative(fruits);
        obj.displayUsingStreams(fruits);
    }

    public void displayUsingInterview(List<String> fruits) {
        Map<String, Integer> fruitCache = new HashMap<>();
        for (int i = 0; i < fruits.size(); i++) {
            String fruit = fruits.get(i);
            if (fruitCache.containsKey(fruit)) {
                fruitCache.put(fruit, fruitCache.get(fruit) + 1);
            } else {
                fruitCache.put(fruit, 1);
            }
        }

        System.out.println(fruitCache);
    }

    public void displayUsingImperative(List<String> fruits) {
        Map<String, Integer> fruitCache = new HashMap<>();
        for (String fruit : fruits) {
            if (fruitCache.containsKey(fruit)) {
                fruitCache.put(fruit, fruitCache.get(fruit) + 1);
            } else {
                fruitCache.put(fruit, 1);
            }
        }
        System.out.println(fruitCache);
    }

    public void displayUsingStreams(List<String> fruits) {
        Map<String, Long> result = fruits.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(result);
    }

}
