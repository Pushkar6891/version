package com.javatechie.spring.batch.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javatechie.spring.batch.api.data.Person;

public interface PersonRepository extends MongoRepository<Person, Integer> {

}