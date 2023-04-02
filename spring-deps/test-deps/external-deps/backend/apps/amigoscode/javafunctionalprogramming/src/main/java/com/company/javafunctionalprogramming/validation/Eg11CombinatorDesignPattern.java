package com.company.javafunctionalprogramming.validation;

import java.time.LocalDate;

public class Eg11CombinatorDesignPattern {
    public static void main(String[] args) {

        CustomerValidatorService service = new CustomerValidatorService();

        System.out.println("Without Combinator Design Pattern");
        System.out.println(service.isValid(new Customer(
                "Pushkar",
                "pushkarchauhan91@gmail.com",
                "+919826396465",
                LocalDate.of(1991, 8, 6)
        )));

        System.out.println("With Combinator Design Pattern");

        // Lazy Loading in Streams unless terminal function is invoked
        ValidationResult result = CustomerRegistrationValidator.isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isAnAdult())
                .apply(new Customer(
                        "Pushkar",
                        "pushkarchauhan91@gmail.com",
                        "+919826396465",
                        LocalDate.of(1991, 8, 6)
                ));

        System.out.println(result);

        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException(result.name());
        }
    }
}
