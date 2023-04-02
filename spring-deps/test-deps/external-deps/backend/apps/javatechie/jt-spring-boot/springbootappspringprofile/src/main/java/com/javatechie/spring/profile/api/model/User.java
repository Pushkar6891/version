package com.javatechie.spring.profile.api.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class User {
	@Id
	private int id;
	private String name;
}
