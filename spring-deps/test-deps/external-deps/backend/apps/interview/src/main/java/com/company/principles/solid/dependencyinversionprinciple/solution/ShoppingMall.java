package com.company.principles.solid.dependencyinversionprinciple.solution;

public class ShoppingMall {

    private com.company.principles.solid.dependencyinversionprinciple.solution.BankCard bankCard;

    public ShoppingMall(com.company.principles.solid.dependencyinversionprinciple.solution.BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void doPurchaseSomething(long amount) {
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        // DebitCard debitCard=new DebitCard();
        // CreditCard creditCard=new CreditCard();

        BankCard bankCard = new CreditCard();
        ShoppingMall shoppingMall = new ShoppingMall(bankCard);
        shoppingMall.doPurchaseSomething(5000);
    }
}