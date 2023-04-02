package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.company.model.Account;
import com.company.service.impl.AccountService;
import com.company.service.impl.AccountServiceImpl;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringBootAopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootAopApplication.class, args);
		AccountService accountService = ctx.getBean("accountServiceImpl", AccountServiceImpl.class);
		accountService.updateAccountBalance(new Account("6778888886", "Money tranfer"), 3000L);
	}
}
