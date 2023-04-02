package com.javatechie.spring.neo4j.api.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

import com.javatechie.spring.neo4j.api.node.Customer;

public interface CustomerRepository extends Neo4jRepository<Customer, Integer>{

	Customer findByName(String name);

}
