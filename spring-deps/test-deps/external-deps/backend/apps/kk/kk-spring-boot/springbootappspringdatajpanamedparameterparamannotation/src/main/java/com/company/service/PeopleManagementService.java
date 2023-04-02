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

	public List<Person> findByLastNameOrFirstName(String lastName, String firstName) {
		return peopleManangementDao.findByLastNameOrFirstName(lastName, firstName);
	}

}
