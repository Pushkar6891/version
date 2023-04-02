package com.javatechie.spring.jsonDocs.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jsondoc.core.annotation.ApiObject;
import org.jsondoc.core.annotation.ApiObjectField;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@ApiObject
public class Employee {
	@Id
	@GeneratedValue
	@ApiObjectField(name = "employee id", description = "Auto generated id")
	private int id;
	@ApiObjectField(name = "employee name", description = "name same as voterId")
	private String name;
	@ApiObjectField(name = "department", description = "dept section")
	private String dept;
	@ApiObjectField(name = "salary", description = "annual income")
	private double salary;
}
