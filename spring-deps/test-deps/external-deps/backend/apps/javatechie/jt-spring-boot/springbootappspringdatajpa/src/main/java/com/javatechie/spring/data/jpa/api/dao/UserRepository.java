package com.javatechie.spring.data.jpa.api.dao;

import com.javatechie.spring.data.jpa.api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

	public List<User> findByProfession(String profession);

	public long countByAge(int age);

	public List<User> deleteByName(String name);

	// multi condition
	public List<User> findByProfessionAndAge(String profession, int age);

	// ignore case
	public List<User> findByProfessionIgnoreCase(String profession);

	
	@Query("select u from User u")
	public List<User> getUsersCustomQuery();

}
