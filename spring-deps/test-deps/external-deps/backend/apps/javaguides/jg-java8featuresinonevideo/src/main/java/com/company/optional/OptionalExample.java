package com.company.optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        String email1 = "pushkarchauhan91@gmail.com";
        String email2 = null;

        Optional<Object> emptyOptional1 = Optional.empty();
        System.out.println(emptyOptional1);

        System.out.println();

        Optional<String> emailOptional1 = Optional.of(email1);
        System.out.println(emailOptional1);

        System.out.println();

        Optional<String> stringOptional1 = Optional.ofNullable(email1);
        System.out.println(stringOptional1);

        System.out.println();

//        Optional<String> emailOptional2 = Optional.of(email2);
//        System.out.println(emailOptional2);

        System.out.println();

        Optional<String> stringOptional2 = Optional.ofNullable(email1);
        if (stringOptional2.isPresent())
            System.out.println(stringOptional2.get());
        else
            System.out.println("No Value present");

        System.out.println();

        Optional<String> stringOptional3 = Optional.ofNullable(email2);
        if (stringOptional3.isPresent())
            System.out.println(stringOptional3.get());
        else
            System.out.println("No Value present");

        System.out.println();

        String defaultOptional1 = Optional.ofNullable(email2).orElse("No Value present");
        System.out.println(defaultOptional1);

        System.out.println();

        String defaultOptional2 = Optional.ofNullable(email2).orElseGet(() -> "default@gmail.com");
        System.out.println(defaultOptional2);

        System.out.println();

       // String defaultOptional3 = Optional.ofNullable(email2).orElseThrow(() -> new IllegalArgumentException("Email does not Exist"));
       // System.out.println(defaultOptional3);

        System.out.println();

        Optional<String> gender = Optional.of("MALE");
        Optional emptyOptional2 = Optional.empty();

        gender.ifPresent((s)-> System.out.println("gender value present"));
        emptyOptional2.ifPresent((s)-> System.out.println("no value present")); // this value will not print anything

        System.out.println();

        String result = "     abc";
        if(result!=null && result.contains("abc")){
            System.out.println(result);
        }

        System.out.println();

        Optional<String> optionalString1 = Optional.of(result);
        optionalString1.filter(e -> e.contains("abc"))
                      .ifPresent(e -> System.out.println(e));

        System.out.println("\nOptional map");

        Optional<String> optionalString2 = Optional.of(result);
        optionalString2.filter(e -> e.contains("abc"))
                .map(String::trim)
                .ifPresent(e -> System.out.println(e));

        System.out.println();
    }
}
