package com.javatechie.spring.mockito.api.model;

import lombok.Data;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Setter
@Data
public class Employee {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String dept;
}
