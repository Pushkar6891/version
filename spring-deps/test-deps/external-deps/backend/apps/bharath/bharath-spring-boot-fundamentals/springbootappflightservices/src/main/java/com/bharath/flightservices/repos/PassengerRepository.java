package com.bharath.flightservices.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.flightservices.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer> {

}
