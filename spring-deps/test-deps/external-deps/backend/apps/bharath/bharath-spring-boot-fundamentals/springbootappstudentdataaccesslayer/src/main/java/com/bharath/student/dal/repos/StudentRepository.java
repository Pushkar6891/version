package com.bharath.student.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.bharath.student.dal.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {

}
