package com.bharath.flightservices.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.flightservices.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
