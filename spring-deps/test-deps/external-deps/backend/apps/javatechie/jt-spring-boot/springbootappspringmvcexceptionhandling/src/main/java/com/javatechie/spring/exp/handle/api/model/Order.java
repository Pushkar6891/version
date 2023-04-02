package com.javatechie.spring.exp.handle.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ORDER_TB")
public class Order {
	@Id
	private int id;
	private String name;
	private String catagory;
	private double amount;
}
