package com.company.javaeight.imperativevsdeclarative;

import lombok.extern.slf4j.Slf4j;

import java.util.stream.IntStream;

@Slf4j
public class ImperativeVsDeclarativeSum {

    public static void main(String[] args) {

        ImperativeVsDeclarativeSum obj = new ImperativeVsDeclarativeSum();
        obj.imperativeStyle(0,1_000_000_000);
        System.out.println("---------");
        obj.declarativeStyle(0,1_000_000_000);
        System.out.println("---------");
        obj.declarativeStyleParallel(0,1_000_000_000);
    }

    private void imperativeStyle(int startRange, int endRange) {
        long startTimerImperative = System.currentTimeMillis();
        int sum = 0;
        for (int i = startRange; i <= endRange; i++) {
            sum += i;
        }
        long endTimerImperative = System.currentTimeMillis();
        log.info("Sum : {} took {} seconds", sum, (endTimerImperative - startTimerImperative));
    }

    private void declarativeStyle(int startRange, int endRange) {
        int sum = 0;
        long startTimerDeclarative = System.currentTimeMillis();
        sum = IntStream.range(startRange, endRange).sum();
        long endTimerDeclarative = System.currentTimeMillis();
        log.info("Sum : {} took {} seconds", sum, (endTimerDeclarative - startTimerDeclarative));
    }

    private void declarativeStyleParallel(int startRange, int endRange) {
        int sum = 0;
        long startTimerDeclarative = System.currentTimeMillis();
        sum = IntStream.range(startRange, endRange).parallel().sum();
        long endTimerDeclarative = System.currentTimeMillis();
        log.info("Sum : {} took {} seconds", sum, (endTimerDeclarative - startTimerDeclarative));
    }
}
