package com.learnjava.eg01.parallelism;

import java.util.List;

public class ParallelismExample {
    public static void main(String[] args) {
        List<String> states = List.of("Delhi", "MP", "Karnataka", "Kerala", "WB", "GJ", "RJ");
        System.out.println("States : " + states);

        long startParallelStream = System.currentTimeMillis();
        List<String> statesUppercase = states.parallelStream().map(String::toUpperCase).toList();
        System.out.println("States in Uppercase : " + statesUppercase);
        long endParallelStream = System.currentTimeMillis();
        System.out.println("Total time taken in parallel : " + (endParallelStream - startParallelStream) + " ms");

        long startStream = System.currentTimeMillis();
        List<String> statesLowercase = states.stream().map(String::toLowerCase).toList();
        System.out.println("States in Lowercase : " + statesLowercase);
        long endStream = System.currentTimeMillis();
        System.out.println("Total time taken in stream : " + (endStream - startStream) + " ms");
    }
}
