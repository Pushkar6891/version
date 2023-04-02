package com.company.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<LocalDateTime> supplier1 = () -> LocalDateTime.now();
        System.out.println(supplier1.get());

        Supplier<LocalDateTime> supplier2 = LocalDateTime::now;
        System.out.println(supplier2.get());
    }
}
