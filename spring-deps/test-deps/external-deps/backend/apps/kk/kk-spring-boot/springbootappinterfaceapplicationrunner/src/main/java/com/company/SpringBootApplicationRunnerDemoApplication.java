package com.company;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootApplicationRunnerDemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = SpringApplication.run(SpringBootApplicationRunnerDemoApplication.class,
				args);
		MessageServiceProvider messageServiceProvider = ctx.getBean(MessageServiceProvider.class);

		String message = messageServiceProvider.message();
		System.out.println(message);

	}
}
