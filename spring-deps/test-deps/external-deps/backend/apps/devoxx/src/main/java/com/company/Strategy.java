package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
// https://www.youtube.com/watch?v=e4MT_OguDKg
public class Strategy {
    public static void main(String[] args) {
        Strategy obj = new Strategy();
        List<Integer> numbers = Arrays.asList(1, 3, 2, 6, 0);

        Predicate<Integer> p1 = n -> true;
        Predicate<Integer> p2 = n -> n % 2 == 0;
        Predicate<Integer> p3 = n -> n % 2 != 0;

        System.out.println(obj.totalValues(numbers, p1));
        System.out.println(obj.totalValues(numbers, p2));
        System.out.println(obj.totalValues(numbers, p3));

        System.out.println();
        System.out.println(numbers.stream()
                .filter(p1)
                .reduce(0,Integer::sum));
        System.out.println(numbers.stream()
                .filter(p2)
                .reduce(0,Integer::sum));
        System.out.println(numbers.stream()
                .filter(p3)
                .reduce(0,Integer::sum));

        System.out.println();
        System.out.println(numbers.stream()
                .filter(p1)
                .mapToInt(n -> n)
                .sum());
    }

    public static int totalValues(List<Integer> numbers, Predicate<Integer> selector) {
        int result = 0;
        for (int number : numbers) {
            if (selector.test(number)) {
                result += number;
            }
        }
        return result;
    }
}
