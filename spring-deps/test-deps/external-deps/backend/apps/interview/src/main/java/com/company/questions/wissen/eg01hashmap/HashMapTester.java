package com.company.questions.wissen.eg01hashmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapTester {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Sachin", 10000);
        map.put("Vikrant", 7000);
        map.put("Rohit", 6000);
        map.put("Virat", 3000);
        map.put("Laxman", 1000);

        System.out.println("Before");
        map.forEach((k, v) -> System.out.println(k + " " + v));

        LinkedHashMap<String, Integer> sortedMap = map.entrySet()
                .stream()
        //      .sorted((c1, c2) -> c1.getValue() - c2.getValue())
                .sorted(Comparator.comparingInt(Map.Entry::getValue))
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (c1, c2) -> c1, LinkedHashMap::new));

        System.out.println("\nAfter");
        sortedMap.forEach((k, v) -> System.out.println(k + " " + v));

    }
}
