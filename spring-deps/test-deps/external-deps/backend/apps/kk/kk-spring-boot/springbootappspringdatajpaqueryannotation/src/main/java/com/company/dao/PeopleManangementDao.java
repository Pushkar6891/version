package com.company.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.company.entities.Person;

public interface PeopleManangementDao extends CrudRepository<Person, Integer> {

	@Query(value = "SELECT p FROM Person p WHERE p.lastName=?1")
	List<Person> getPersonInfoByLastName(String lastName);

	@Query(value = "SELECT p FROM Person p WHERE p.firstName=?1 AND email=?2")
	List<Person> findByFirstNameAndEmail(String firstName, String email);
	
	@Query(value = "SELECT * FROM person_table WHERE last_name=?1", nativeQuery = true)
	List<Person> getPersonInfoByLastNameUsingNativeQuery(String lastName);
	
	@Query(value = "SELECT * FROM person_table WHERE first_name=?1 AND email=?2", nativeQuery = true)
	List<Person> findByFirstNameAndEmailUsingNativeQuery(String firstName, String email);
}
