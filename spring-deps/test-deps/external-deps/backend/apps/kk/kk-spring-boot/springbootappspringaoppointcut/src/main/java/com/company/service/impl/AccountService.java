package com.company.service.impl;

import com.company.model.Account;

public interface AccountService {
	public abstract void updateAccountBalance(Account account, Long amount);
}