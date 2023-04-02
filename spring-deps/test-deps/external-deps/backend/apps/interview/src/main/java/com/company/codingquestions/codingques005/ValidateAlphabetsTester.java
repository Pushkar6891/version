package com.company.codingquestions.codingques005;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ValidateAlphabetsTester {
    public static void main(String[] args) {
        ValidateAlphabetsTester validateAlphabetsObj = new ValidateAlphabetsTester();
        String key = "a";
        String[] batsmen = {"Sachin", "Ricky", "Brian"};
        String[] bowlers = {"Wasim", "Zaheer", "Jim", "Donald"};
        System.out.println(validateAlphabetsObj.validateAlphabetsUsingAllMatch(batsmen, key));
        System.out.println(validateAlphabetsObj.validateAlphabetsUsingAllMatch(bowlers, key));
        System.out.println(validateAlphabetsObj.validateAlphabetsUsingPredicate(batsmen, key));
        System.out.println(validateAlphabetsObj.validateAlphabetsUsingPredicate(bowlers, key));
        System.out.println(validateAlphabetsObj.validateAlphabetsUsingPartitioningBy(batsmen, key));
        System.out.println(validateAlphabetsObj.validateAlphabetsUsingPartitioningBy(bowlers, key));
    }

    private boolean validateAlphabetsUsingAllMatch(String[] cricketers, String key) {
        return Arrays.stream(cricketers).allMatch(e -> e.contains(key));
    }

    private List<String> validateAlphabetsUsingPredicate(String[] cricketers, String key) {
        Predicate<String> predicateContainingKey = e -> e.contains(key);
        return Arrays.stream(cricketers).filter(predicateContainingKey).collect(Collectors.toList());
    }

    private Map<List<String>, String> validateAlphabetsUsingPartitioningBy(String[] cricketers, String key) {
        Predicate<String> predicateContainingKey = e -> e.contains(key);
        Map<List<String>, String> resultCache = new HashMap<>();
        Map<Boolean, List<String>> intermediateCache = Arrays.stream(cricketers).collect(Collectors.partitioningBy(predicateContainingKey, Collectors.toList()));
        for (Map.Entry<Boolean, List<String>> entry : intermediateCache.entrySet()) {
            if (Boolean.TRUE.equals(entry.getKey())) {
                resultCache.put(entry.getValue(), "YES");
            } else {
                resultCache.put(entry.getValue(), "NO");
            }
        }
        return resultCache;
    }

}
