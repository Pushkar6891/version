package com.company.javafullcourse;

import java.util.Arrays;

public class Eg17EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {9,8,2,6,3,9,6,4,6,5};

        System.out.println("For Loop");
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        System.out.println("Enhanced For Loop");
        for(int number : numbers){
            System.out.println(number);
        }

        System.out.println("Using Array Stream");
        Arrays.stream(numbers).forEach(System.out::println);

    }
}
