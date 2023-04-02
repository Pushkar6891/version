package com.company.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<String,String> checkEquality = (s1,s2) -> s1.equals(s2);
        System.out.println(checkEquality.test("Pushkar","pushkar"));
        System.out.println(checkEquality.test("Pushkar","Pushkar"));
    }
}
