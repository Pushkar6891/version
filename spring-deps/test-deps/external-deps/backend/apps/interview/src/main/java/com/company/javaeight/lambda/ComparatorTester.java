package com.company.javaeight.lambda;

import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;

@Slf4j
public class ComparatorTester {
    public static void main(String[] args) {
        Comparator<Integer> comparator1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        Comparator<Integer> comparator2 = (o1, o2) -> o1.compareTo(o2);
        Comparator<Integer> comparator3 = Integer::compareTo;
        Comparator<Integer> comparator4 = Comparator.naturalOrder();

        log.info("Comparator : {}", comparator1.compare(20, 10));
        log.info("Comparator : {}", comparator2.compare(20, 10));
        log.info("Comparator : {}", comparator3.compare(20, 10));
        log.info("Comparator : {}", comparator4.compare(20, 10));
    }
}
