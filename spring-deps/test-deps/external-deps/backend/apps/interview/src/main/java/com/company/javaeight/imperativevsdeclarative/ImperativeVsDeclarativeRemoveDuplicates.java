package com.company.javaeight.imperativevsdeclarative;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class ImperativeVsDeclarativeRemoveDuplicates {
    public static void main(String[] args) {
        ImperativeVsDeclarativeRemoveDuplicates obj = new ImperativeVsDeclarativeRemoveDuplicates();
        obj.imperativeStyle();
        log.info("------------");
        obj.declarativeStyle();
        log.info("------------");
        obj.declarativeStyleParallel();
    }

    private void imperativeStyle() {
        long startTimerImperative = System.currentTimeMillis();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10);
        List<Integer> uniqueNumbers = new LinkedList<>();

        for (Integer number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }
        long endTimerImperative = System.currentTimeMillis();
        log.info("Numbers : {} took {} seconds", uniqueNumbers, (endTimerImperative - startTimerImperative));
    }

    private void declarativeStyle() {
        long startTimerDeclarative = System.currentTimeMillis();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10);
        List<Integer> uniqueNumbers = numbers.stream().distinct().collect(Collectors.toList());
        long endTimerDeclarative = System.currentTimeMillis();
        log.info("Numbers : {} took {} seconds", uniqueNumbers, (endTimerDeclarative - startTimerDeclarative));
    }

    private void declarativeStyleParallel() {
        long startTimerDeclarative = System.currentTimeMillis();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10);
        List<Integer> uniqueNumbers = numbers.stream().parallel().distinct().collect(Collectors.toList());
        long endTimerDeclarative = System.currentTimeMillis();
        log.info("Numbers : {} took {} seconds", uniqueNumbers, (endTimerDeclarative - startTimerDeclarative));
    }
}
