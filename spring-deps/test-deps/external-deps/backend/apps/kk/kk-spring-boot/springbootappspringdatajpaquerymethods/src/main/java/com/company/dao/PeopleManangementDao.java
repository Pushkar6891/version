package com.company.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.company.entities.Person;

public interface PeopleManangementDao extends CrudRepository<Person, Integer> {
	List<Person> findByLastName(String lastName);
	List<Person> findByFirstNameAndEmail(String firstName,String email);
}
