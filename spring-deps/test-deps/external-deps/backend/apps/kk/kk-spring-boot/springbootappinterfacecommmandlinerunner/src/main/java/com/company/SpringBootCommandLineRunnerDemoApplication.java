package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.company.service.MessageServiceProvider;

@SpringBootApplication
public class SpringBootCommandLineRunnerDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootCommandLineRunnerDemoApplication.class, args);
		MessageServiceProvider messageServiceProvider = ctx.getBean(MessageServiceProvider.class);
		
		String message = messageServiceProvider.message();
		System.out.println(message);
	}
}
