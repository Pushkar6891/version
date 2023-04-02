package com.company;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.company.service.PeopleManagementService;

@SpringBootApplication
public class QueryAnnotationAndUpdateDataStoreApplication implements CommandLineRunner {

	@Autowired
	private PeopleManagementService peopleManagementService;

	public static void main(String[] args) {
		SpringApplication.run(QueryAnnotationAndUpdateDataStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		int id = 1;
		String newEmail = "ajay.k9999@gmail.com";
		peopleManagementService.updatePersonEmailById(id, newEmail);
	}
}
