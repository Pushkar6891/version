package com.company;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorFunctionalInterfaceTester {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
        UnaryOperator<Integer> unaryOperator = i -> i * i;
        unaryOperatorFunction(unaryOperator, list).forEach(x -> System.out.println(x));

    }

    // Calculating square of every number
    private static List<Integer> unaryOperatorFunction(UnaryOperator<Integer> unaryOperator, List<Integer> list) {
        List<Integer> unaryList = new LinkedList<>();
        list.forEach(i -> unaryList.add(unaryOperator.apply(i)));
        return unaryList;
    }

}
