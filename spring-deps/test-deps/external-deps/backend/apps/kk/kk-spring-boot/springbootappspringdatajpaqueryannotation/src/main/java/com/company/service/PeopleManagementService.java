package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.PeopleManangementDao;
import com.company.entities.Person;

@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManangementDao peopleManangementDao;

	public Person createPerson(Person person1) {
		return peopleManangementDao.save(person1);
	}

	public Iterable<Person> createPersons(List<Person> personList) {
		Iterable<Person> list = peopleManangementDao.saveAll(personList);
		return list;
	}

	public List<Person> getPersonsInfoByLastName(String lastName) {
		return peopleManangementDao.getPersonInfoByLastName(lastName);
	}

	public List<Person> getPersonsInfoByFirstNameAndEmail(String firstName, String email) {
		return peopleManangementDao.findByFirstNameAndEmail(firstName, email);
	}

	public List<Person> getPersonInfoByLastNameUsingNativeQuery(String lastName) {
		return peopleManangementDao.getPersonInfoByLastNameUsingNativeQuery(lastName);
	}

	public List<Person> getPersonInfoByLastNameAndEmailUsingNativeQuery(String firstName, String email) {
		return peopleManangementDao.findByFirstNameAndEmailUsingNativeQuery(firstName, email);
	}
}
