package com.company.controller;

import com.company.model.User;
import com.company.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class UserController {

	private final UserService service;

	public UserController(final UserService service) {
		this.service = service;
	}

	@PostMapping(value = "/save")
	public User saveUser(@RequestBody User user) {
		return service.addUser(user);
	}

	@GetMapping("/getUsers")
	public List<User> findAllUsers() {
		return service.getUsers();
	}

	@GetMapping("/getUserByAddress/{address}")
	public List<User> findUserByAddress(@PathVariable String address) {
		return service.getUserbyAddress(address);
	}

	@DeleteMapping(value = "/user/{id}")
	public void removeUser(@PathVariable int id) {
		service.deleteById(id);
	}

}
