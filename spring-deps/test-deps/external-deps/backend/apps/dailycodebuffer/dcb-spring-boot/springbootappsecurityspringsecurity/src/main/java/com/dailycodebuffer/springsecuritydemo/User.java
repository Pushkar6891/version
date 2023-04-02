package com.dailycodebuffer.springsecuritydemo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	private Long id;
	private String username;
	private String password;
	private String role;

}
