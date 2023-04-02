package com.company.javafullcourse;

import java.util.Arrays;

public class Eg16Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] = 6;
        numbers[1] = 5;
        numbers[2] = 2;

        // error
        // numbers[3] = 4;
        System.out.println(Arrays.toString(numbers));
        System.out.println(numbers.length);

        int[] primes = {7, 11, 13, 17, 19};
        System.out.println(Arrays.toString(primes));
        System.out.println(primes.length);

        String[] cities = {"Bangalore", "Delhi", "Pune"};
        System.out.println(cities.length);

        String firstCity = cities[0];
        String secondCity = cities[1];
        String thirdCity = cities[cities.length - 1];

        System.out.println(firstCity);
        System.out.println(secondCity);
        System.out.println(thirdCity);
    }
}
