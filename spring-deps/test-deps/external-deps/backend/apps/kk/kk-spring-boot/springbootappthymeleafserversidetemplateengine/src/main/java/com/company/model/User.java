package com.company.model;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@NotNull
	private String userId;
	@NotNull
	private String userName;
	@NotNull
	private String gender;
	private Boolean married;
	private String profile;
}
