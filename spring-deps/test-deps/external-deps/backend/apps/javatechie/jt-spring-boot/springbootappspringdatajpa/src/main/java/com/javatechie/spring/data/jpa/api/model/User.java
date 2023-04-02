package com.javatechie.spring.data.jpa.api.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table
public class User {
	@Id
	private int id;
	private String name;
	private String profession;
	private int age;
}
