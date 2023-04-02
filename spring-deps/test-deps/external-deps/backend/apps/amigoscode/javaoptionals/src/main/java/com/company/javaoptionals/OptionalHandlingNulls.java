package com.company.javaoptionals;

import com.company.Person;

public class OptionalHandlingNulls {
    public static void main(String[] args) {
        OptionalHandlingNulls obj = new OptionalHandlingNulls();
        Person p1 = new Person("Pushkar", "pushkarchauhan91@gmail.com");
        Person p2 = new Person("Amit", null);

        obj.way1(p1, p2);
        System.out.println();
        obj.way2(p1);
        System.out.println();
        obj.way2(p2);

    }

    public void way1(Person p1, Person p2) {
        System.out.println(p1.getEmail().map(String::toUpperCase).orElse("invalid email provided"));
        System.out.println(p2.getEmail().map(String::toUpperCase).orElse("invalid email provided"));
    }

    public void way2(Person p) {
        if (p.getEmail().isPresent()) {
            String email = p.getEmail().get();
            System.out.println(email.toUpperCase());
        } else {
            System.out.println("invalid email provided");
        }
    }
}
