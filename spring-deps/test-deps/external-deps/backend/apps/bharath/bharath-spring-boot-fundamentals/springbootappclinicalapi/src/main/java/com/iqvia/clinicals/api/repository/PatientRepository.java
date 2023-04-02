package com.iqvia.clinicals.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iqvia.clinicals.api.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

	List<Patient> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);

}
