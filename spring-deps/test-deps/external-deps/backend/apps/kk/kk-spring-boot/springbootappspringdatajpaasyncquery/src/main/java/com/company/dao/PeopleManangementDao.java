package com.company.dao;

import java.util.concurrent.CompletableFuture;

import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;

import com.company.entities.Person;

public interface PeopleManangementDao extends CrudRepository<Person, Integer>{
	
	@Async
	CompletableFuture<Person> findByEmail(String email);
}
