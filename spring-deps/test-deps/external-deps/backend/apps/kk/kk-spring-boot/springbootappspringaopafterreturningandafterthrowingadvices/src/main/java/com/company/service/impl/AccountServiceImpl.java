package com.company.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.company.model.Account;

@Service
public class AccountServiceImpl implements AccountService {

	private static Map<String, Account> map = null;

	static {
		map = new HashMap<>();
		map.put("C67669800", new Account("78278287000", "Saving Account"));
		map.put("C67669811", new Account("78278287111", "Current Account"));
	}

	@Override
	public Account getAccountByCustomerId(String customerId) throws Exception {
		if (customerId == null) {
			throw new Exception("Customer Id is invlaid");
		}
		Account account = null;
		Set<Entry<String, Account>> entrySet = map.entrySet();
		for (Entry<String, Account> entry : entrySet) {
			if (entry.getKey().equals(customerId)) {
				account = entry.getValue();
			}
		}
		return account;
	}
}
