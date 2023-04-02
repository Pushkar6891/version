package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.PeopleManangementDao;

@Service
public class PeopleManagementService {

	@Autowired
	private PeopleManangementDao peopleManangementDao;

	public void updatePersonEmailById(int id, String newEmail) {
		peopleManangementDao.updatePersonEmailById(id, newEmail);
	}

}
