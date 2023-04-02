package com.company.questions.hcl.eg11findaverageofalnumbersgreaterthan100;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageTester {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(80, 60, 30, 10);
        OptionalDouble average = numbers.stream().filter(n -> n > 40).mapToInt(n -> n.intValue()).average();
        if (average.isPresent()) {
            System.out.println(average.getAsDouble());
        }
    }
}
