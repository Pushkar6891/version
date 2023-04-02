package com.javatechie.spring.neo4j.api.node;

import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Node("book")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {

	@Id
	private String id;
	private String name;
	private String author;
}
