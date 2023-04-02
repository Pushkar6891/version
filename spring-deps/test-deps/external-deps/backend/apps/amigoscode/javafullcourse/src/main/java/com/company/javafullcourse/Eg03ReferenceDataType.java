package com.company.javafullcourse;

import java.time.LocalDate;

public class Eg03ReferenceDataType {
    public static void main(String[] args) {
        String name = new String("Pushkar");

        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getYear());
    }
}
