package com.company.service;

import com.company.dao.PeopleManangementDao;
import com.company.entities.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleManagementService {

	private final PeopleManangementDao peopleManangementDao;

	public PeopleManagementService(PeopleManangementDao peopleManangementDao) {
		this.peopleManangementDao = peopleManangementDao;
	}

	public Person createPerson(Person person1) {
		return peopleManangementDao.save(person1);
	}

	public Iterable<Person> createPersons(List<Person> personList) {
		return peopleManangementDao.saveAll(personList);
	}

	public List<Person> getPersonInfoByLastName(String lastName) {
		return peopleManangementDao.getPersonInfoByLastName(lastName);
	}

	public List<Person> getPersonInfoByFirstNameAndEmail(String firstName, String email) {
		return peopleManangementDao.getPersonInfoByFirstNameAndEmail(firstName, email);
	}

}
