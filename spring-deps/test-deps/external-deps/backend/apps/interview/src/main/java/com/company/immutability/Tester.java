package com.company.immutability;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {

        Address homeAddress = new Address("Indore", "MP", "India");
        System.out.println("Address Object 1 : " + homeAddress.hashCode());

        List<String> phoneNumbers = new LinkedList<>(Arrays.asList("9826396465", "6362660412"));
        Employee pushkar = new Employee(1, "Pushkar", homeAddress, phoneNumbers);
        System.out.println(pushkar);

        phoneNumbers.add("1234567890");

        // pushkar.getPhoneNumbers().add("1234567890");

        Address address = pushkar.getAddress();
        System.out.println("Address Object 2 : " + address.hashCode());

        address.setCity("Bangalore");
        address.setState("Karnataka");
        address.setCountry("India");

        System.out.println(pushkar);
    }
}
// Employee is Immutable
// Address is Mutable