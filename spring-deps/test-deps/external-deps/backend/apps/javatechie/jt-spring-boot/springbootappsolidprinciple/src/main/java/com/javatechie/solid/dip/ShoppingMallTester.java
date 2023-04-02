package com.javatechie.solid.dip;

public class ShoppingMallTester {

	private BankCard bankCard;

	public ShoppingMallTester(BankCard bankCard) {
		this.bankCard = bankCard;
	}

	public void doPurchaseSomething(long amount) {
		bankCard.doTransaction(amount);
	}

	public static void main(String[] args) {
		// DebitCard debitCard=new DebitCard();
		// CreditCard creditCard=new CreditCard();

		BankCard bankCard = new CreditCard();
		ShoppingMallTester shoppingMall = new ShoppingMallTester(bankCard);
		shoppingMall.doPurchaseSomething(5000);
	}
}
