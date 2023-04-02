package com.bharath.document.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Document {
	@Id
	private long id;
	private String name;
	@Lob
	private byte[] data;
}
