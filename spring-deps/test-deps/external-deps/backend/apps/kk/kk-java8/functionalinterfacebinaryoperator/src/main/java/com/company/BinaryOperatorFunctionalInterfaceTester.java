package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

public class BinaryOperatorFunctionalInterfaceTester {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("X", "A");
        map.put("Y", "B");
        map.put("Z", "C");

        // Define Binary Operator as a Lambda Expression
        BinaryOperator<String> binaryOperator = (s1, s2) -> s1 + "-" + s2;
        binaryOperatorFunction(binaryOperator, map).forEach(x -> System.out.println(x));
        System.out.println("----------------------------------------------------------");
        binaryOperatorFunction(binaryOperator, map).forEach(System.out::println);

    }

    private static List<String> binaryOperatorFunction(BinaryOperator<String> binaryOperator, Map<String, String> map) {
        List<String> binaryList = new LinkedList<>();
        map.forEach((s1, s2) -> binaryList.add(binaryOperator.apply(s1, s2)));
        return binaryList;
    }

}
