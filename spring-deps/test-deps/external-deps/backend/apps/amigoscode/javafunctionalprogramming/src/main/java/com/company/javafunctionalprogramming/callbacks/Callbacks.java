package com.company.javafunctionalprogramming.callbacks;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {
        Callbacks obj = new Callbacks();
        obj.greet("Pushkar", "Chauhan", null);
        obj.greet("Sachin", null, value -> {
            System.out.println("lastName not provided for " + value);
        });
        obj.wish("Sachin", null, () ->
                System.out.println("lastName not provided")
        );

    }

    public void greet(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    public void wish(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }

    /*
    function greet(firstName, lastName, callback) {
        console.log(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback();
        }
    }
     */
}
