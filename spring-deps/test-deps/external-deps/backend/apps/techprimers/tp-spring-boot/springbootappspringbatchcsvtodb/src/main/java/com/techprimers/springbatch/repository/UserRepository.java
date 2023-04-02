package com.techprimers.springbatch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprimers.springbatch.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
