package com.bharath.springdata.transactionmanagement.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bharath.springdata.transactionmanagement.entities.BankAccount;
import com.bharath.springdata.transactionmanagement.repository.BankAccountRepository;

@Service
public class BankAccountServiceImpl implements BankAccountService {

	@Autowired
	private BankAccountRepository bankAccountRepository;

	@Override
	@Transactional
	public void transfer(int amount) {
		BankAccount bankAccount1 = bankAccountRepository.findById(1).get();
		bankAccount1.setBal(bankAccount1.getBal() - amount);
		bankAccountRepository.save(bankAccount1);

//		if (true) {
//			throw new RuntimeException("A runtime exception has occurred while processing transactions");
//		}

		BankAccount bankAccount2 = bankAccountRepository.findById(2).get();
		bankAccount2.setBal(bankAccount2.getBal() + amount);
		bankAccountRepository.save(bankAccount2);
	}

}
