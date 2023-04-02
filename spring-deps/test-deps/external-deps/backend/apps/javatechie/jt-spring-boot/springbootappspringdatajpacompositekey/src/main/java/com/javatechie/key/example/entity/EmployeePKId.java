package com.javatechie.key.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class EmployeePKId implements Serializable {
	private static final long serialVersionUID = 1L;
	private int employeeId;
	private int deptId;
}
