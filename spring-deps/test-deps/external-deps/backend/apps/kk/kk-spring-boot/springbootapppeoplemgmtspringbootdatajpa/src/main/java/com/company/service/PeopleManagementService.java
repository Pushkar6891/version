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

	public Iterable<Person> getPersonByIds(List<Integer> ids) {
		return peopleManangementDao.findAllById(ids);
	}

	public void deletePersonEntity(Person person) {
		peopleManangementDao.delete(person);
	}

	public void updatePersonEmailById(int id, String newEmail) {
		Person person = peopleManangementDao.findById(id).get();
		if(id==person.getId()){
			person.setEmail(newEmail);
		}
		peopleManangementDao.save(person);
	}
	
}
