package com.company.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.PeopleManangementDao;
import com.company.entities.Person;

@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManangementDao peopleManangementDao;

	public CompletableFuture<Person> findByEmail(String email) {
		return peopleManangementDao.findByEmail(email);
	}

}
