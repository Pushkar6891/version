package com.company.dao;

import com.company.dao.exception.InsufficientAccountBalanceException;
import com.company.model.Account;

public interface BankDao {
	public abstract void deposit(Account fromAccount, Account toAccount, Double amount);

	public abstract void withdraw(Account fromAccount, Account toAccount, Double amount)
			throws InsufficientAccountBalanceException;
}
