package com.javatechie.spring.batch.api.data;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document(collection = "Bank Users")
public class Person {
	@Id
	private int custId;
	private String name;
	private String email;
	private String contactNo;
	@JsonFormat(pattern = "dd-mm-yyyy")
	private Date dob;
	private String status;
	private double outstandingAmount;
	@JsonFormat(pattern = "dd-mm-yyyy")
	private Date lastDueDate;
}
