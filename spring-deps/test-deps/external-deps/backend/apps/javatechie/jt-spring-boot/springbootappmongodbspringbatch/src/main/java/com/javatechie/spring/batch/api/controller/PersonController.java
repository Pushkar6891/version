package com.javatechie.spring.batch.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.batch.api.data.Person;
import com.javatechie.spring.batch.api.repository.PersonRepository;

@RestController
public class PersonController {

	@Autowired
	private PersonRepository repository;

	@PostMapping("/addPerson")
	public String savePerson(@RequestBody Person person) {
		repository.save(person);
		return "Added person with id : " + person.getCustId();
	}
	
	@PostMapping("/addPersons")
	public String savePersons(@RequestBody List<Person> persons) {
		repository.saveAll(persons);
		return "Added " + persons.size() + " persons in db";
	}

	@GetMapping("/findAllPersons")
	public List<Person> getPersons() {
		return repository.findAll();
	}

	@GetMapping("/findAllPersons/{id}")
	public Optional<Person> getPerson(@PathVariable int id) {
		return repository.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deletePerson(@PathVariable int id) {
		repository.deleteById(id);
		return "person deleted with id : " + id;
	}

}