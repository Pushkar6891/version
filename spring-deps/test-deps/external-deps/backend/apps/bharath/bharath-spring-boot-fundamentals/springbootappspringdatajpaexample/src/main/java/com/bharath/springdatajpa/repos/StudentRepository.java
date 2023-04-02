package com.bharath.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
