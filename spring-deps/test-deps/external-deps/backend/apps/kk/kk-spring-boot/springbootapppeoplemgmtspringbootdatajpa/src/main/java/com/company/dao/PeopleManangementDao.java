package com.company.dao;

import org.springframework.data.repository.CrudRepository;

import com.company.entities.Person;

public interface PeopleManangementDao extends CrudRepository<Person, Integer>{

}
