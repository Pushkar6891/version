package com.company.service;

import com.company.dao.exception.InsufficientAccountBalanceException;
import com.company.model.Account;

public interface BankService {
	public abstract void transferFund(Account fromAccount, Account toAccount, Double amount)
			throws InsufficientAccountBalanceException;
}
