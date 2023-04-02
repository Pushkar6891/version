package com.company.principles.solid.dependencyinversionprinciple.problem;

public class DebitCard implements BankCard {

    public void doTransaction(long amount) {
        System.out.println("payment using Debit card");
    }
}