package com.company.javafullcourse;

import java.util.Locale;

public class Eg06StringClass {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';

        String firstName = "Pushkar";
        String lastName = new String("Chauhan");

        // Object have attribute and behaviour
        System.out.println(firstName.toUpperCase() + ' ' + lastName.toLowerCase());
        System.out.println(firstName.charAt(0));
        System.out.println(firstName.contains("kar"));
        System.out.println(firstName.substring(1,5));// 1,2,3,4
        System.out.println(firstName.equals("Pushkar"));
        System.out.println(firstName.equals(lastName));
    }
}
