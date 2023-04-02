package com.iqvia.clinicals.api.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
	@Id
	private int id;
	private String lastName;
	private String firstName;
	private int age;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "patient")
	private List<ClinicalData> clinicalData;
}
