package com.company.codingquestions.codingques004;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class PrintDuplicatesInArrayTester {
    public static void main(String[] args) {
        PrintDuplicatesInArrayTester obj = new PrintDuplicatesInArrayTester();
        String sentence = "Apple Macbook pro is far better than Apple Macbook Air";
        String[] words = sentence.split(" ");
        obj.printDuplicateElementsUsingSet(words);
        System.out.println();
        obj.printDuplicateElementsUsingMap(words);
    }

    private void printDuplicateElementsUsingSet(String[] words) {
        long start = System.currentTimeMillis();
        Set<String> wordSet = new LinkedHashSet<>();
        for (String word : words) {
            /*
            if(wordSet.add(word)==false){
                System.out.println(word);
            }
            */
            if (!wordSet.add(word)) {
                System.out.println(word);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Total time : " + (end - start));
    }

    private void printDuplicateElementsUsingMap(String[] words) {
        long start = System.currentTimeMillis();
        Map<String, Integer> wordCache = new LinkedHashMap<>();
        for (String word : words) {
            if (wordCache.containsKey(word)) {
                wordCache.put(word, wordCache.get(word) + 1);
            } else {
                wordCache.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordCache.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("Total time : " + (end - start));
    }
}
