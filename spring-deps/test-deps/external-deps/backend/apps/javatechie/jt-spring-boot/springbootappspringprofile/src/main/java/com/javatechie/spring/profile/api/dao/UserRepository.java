package com.javatechie.spring.profile.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javatechie.spring.profile.api.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
