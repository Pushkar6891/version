package com.company;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.company.config.EnvBasedCofig;

@SpringBootApplication
public class SpringBootProfilesAppApplication implements CommandLineRunner {

	@Autowired
	private DataSource dataSource;

	@Autowired
	private EnvBasedCofig envBasedCofig;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProfilesAppApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("------------------------------------------");
		System.out.println("DataSource=" + dataSource);

		System.out.println("------------------------------------------");

		envBasedCofig.setup();
	}
}
