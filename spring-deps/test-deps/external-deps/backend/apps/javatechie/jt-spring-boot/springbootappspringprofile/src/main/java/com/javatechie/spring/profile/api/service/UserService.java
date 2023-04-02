package com.javatechie.spring.profile.api.service;

import com.javatechie.spring.profile.api.dao.UserRepository;
import com.javatechie.spring.profile.api.model.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile(value = { "local", "dev", "prod" })
public class UserService {

	private final UserRepository repository;

	public UserService(UserRepository repository) {
		this.repository = repository;
	}

	public List<User> getUsers() {
		return repository.findAll();
	}

}
