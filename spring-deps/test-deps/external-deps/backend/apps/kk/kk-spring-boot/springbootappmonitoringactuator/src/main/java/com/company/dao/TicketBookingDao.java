package com.company.dao;

import org.springframework.data.repository.CrudRepository;

import com.company.entities.Ticket;

public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

}
