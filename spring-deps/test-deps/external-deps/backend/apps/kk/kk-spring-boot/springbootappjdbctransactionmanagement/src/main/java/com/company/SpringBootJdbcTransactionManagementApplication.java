package com.company;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.company.dao.exception.InsufficientAccountBalanceException;
import com.company.model.Account;
import com.company.service.BankService;
import com.company.service.Impl.BankServiceImpl;

@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass = true)
public class SpringBootJdbcTransactionManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootJdbcTransactionManagementApplication.class,
				args);
		BankService bankService = ctx.getBean("bankServiceImpl", BankServiceImpl.class);
		Account fromAccount = new Account();
		fromAccount.setAccountNumber(1122330056L);

		Account toAccount = new Account();
		toAccount.setAccountNumber(3355330099L);

		try {
			bankService.transferFund(fromAccount, toAccount, 1000.00);
		} catch (InsufficientAccountBalanceException e) {
			e.printStackTrace();
		}

		System.out.println("================================================");
		String[] beanDefinitionNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanDefinitionNames);
		System.out.println("All beans loaded by Spring Boot");
		for (String beanName : beanDefinitionNames) {
			System.out.println(beanName);
		}
		System.out.println("================================================");
		ctx.close();

	}
}
