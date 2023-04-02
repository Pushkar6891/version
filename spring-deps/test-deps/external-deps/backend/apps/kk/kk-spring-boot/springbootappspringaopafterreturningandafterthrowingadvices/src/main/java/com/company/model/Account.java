package com.company.model;

public class Account {

	private String accountNumber;
	private String accountDescrption;

	public Account(String accountNumber, String accountDescrption) {
		super();
		this.accountNumber = accountNumber;
		this.accountDescrption = accountDescrption;
	}
	
	public String getAccountDescrption() {
		return accountDescrption;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber
				+ ", accountDescrption=" + accountDescrption + "]";
	}
}
