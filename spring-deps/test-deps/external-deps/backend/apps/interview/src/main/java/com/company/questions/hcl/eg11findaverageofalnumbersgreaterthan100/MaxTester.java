package com.company.questions.hcl.eg11findaverageofalnumbersgreaterthan100;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class MaxTester {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(80, 60, 30, 10);
        OptionalInt max = numbers.stream().filter(n -> n > 40).mapToInt(n -> n.intValue()).max();
        if (max.isPresent()) {
            System.out.println(max.getAsInt());
        }
    }
}
