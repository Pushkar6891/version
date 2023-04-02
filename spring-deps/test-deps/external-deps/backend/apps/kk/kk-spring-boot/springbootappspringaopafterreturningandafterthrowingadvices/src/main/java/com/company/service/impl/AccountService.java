package com.company.service.impl;

import com.company.model.Account;

public interface AccountService {
	public abstract Account getAccountByCustomerId(String customerId) throws Exception;
}