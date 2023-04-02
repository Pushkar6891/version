package com.company;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.company.entities.Person;
import com.company.service.PeopleManagementService;

@SpringBootApplication
public class ParamAnnotationNamedParameterApplication implements CommandLineRunner {

	@Autowired
	private PeopleManagementService peopleManagementService;

	public static void main(String[] args) {
		SpringApplication.run(ParamAnnotationNamedParameterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Person> list = peopleManagementService.findByLastNameOrFirstName("Kumar", "Sean");
		list.forEach(System.out::println);
	}

}
