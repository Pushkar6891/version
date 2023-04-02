package com.company.javafunctionalprogramming;

import java.util.function.Predicate;

public class Eg07Predicate {
    public static void main(String[] args) {
        Eg07Predicate obj = new Eg07Predicate();

        System.out.println("Without Predicate");

        System.out.println(obj.isPhoneNumberValid("+919826396465"));
        System.out.println(obj.isPhoneNumberValid("926396465"));
        System.out.println(obj.isPhoneNumberValid("9263964"));

        System.out.println("With Predicate");

        Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("+91") && phoneNumber.length() == 13;
        Predicate<String> isPhoneNumberContaining7 = phoneNumber -> phoneNumber.contains("7");
        System.out.println(isPhoneNumberValidPredicate.test("+919827396465"));
        System.out.println(isPhoneNumberValidPredicate.test("9826397465"));
        System.out.println(isPhoneNumberValidPredicate.test("98263974"));

        System.out.println("With Predicate Chaining");

        System.out.println(isPhoneNumberValidPredicate.and(isPhoneNumberContaining7).test("+919827396465"));
        System.out.println(isPhoneNumberValidPredicate.and(isPhoneNumberContaining7).test("9826397465"));
        System.out.println(isPhoneNumberValidPredicate.and(isPhoneNumberContaining7).test("+918263974000"));
    }

    public boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+91") && phoneNumber.length() == 13;
    }
}
