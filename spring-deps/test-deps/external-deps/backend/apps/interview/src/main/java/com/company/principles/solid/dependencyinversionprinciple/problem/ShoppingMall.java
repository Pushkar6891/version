package com.company.principles.solid.dependencyinversionprinciple.problem;

public class ShoppingMall {

    private com.company.principles.solid.dependencyinversionprinciple.problem.DebitCard debitCard;

    public ShoppingMall(com.company.principles.solid.dependencyinversionprinciple.problem.DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    public void doPurchaseSomething(long amount) {
        debitCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        com.company.principles.solid.dependencyinversionprinciple.problem.DebitCard debitCard = new DebitCard();
        com.company.principles.solid.dependencyinversionprinciple.problem.CreditCard creditCard = new CreditCard();

        ShoppingMall shoppingMall = new ShoppingMall(debitCard);
        shoppingMall.doPurchaseSomething(5000);
    }
}