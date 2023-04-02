package com.company.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.company.entities.Person;

public interface PeopleManangementDao extends CrudRepository<Person, Integer> {
	List<Person> getPersonInfoByLastName(String lastName);
	List<Person> getPersonInfoByFirstNameAndEmail(String firstName,String email);
}
