package com.company.principles.solid.dependencyinversionprinciple.problem;

public class CreditCard implements BankCard {

    public void doTransaction(long amount) {
        System.out.println("payment using Credit card");
    }
}