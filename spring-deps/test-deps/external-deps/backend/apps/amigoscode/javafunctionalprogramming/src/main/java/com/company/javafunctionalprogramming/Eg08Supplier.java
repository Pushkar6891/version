package com.company.javafunctionalprogramming;

import java.util.List;
import java.util.function.Supplier;

public class Eg08Supplier {
    public static void main(String[] args) {
        Eg08Supplier obj = new Eg08Supplier();
        Supplier<String> getDBConnectionSupplier = () -> "jdbc://localhost:3306/mydb";
        System.out.println(getDBConnectionSupplier.get());
        System.out.println(obj.getDBConnectionSupplier());

        Supplier<List<String>> namesSupplier = () -> List.of("Aman", "Pooja", "Vivek");
        System.out.println(namesSupplier.get());
    }

    public String getDBConnectionSupplier() {
        return "jdbc://localhost:3306/mydb";
    }
}
