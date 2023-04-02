package com.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.company.dao.TicketBookingDao;
import com.company.entities.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketBookingDao;

	@Cacheable(value = "ticketsCache", key = "#ticketId", unless = "#result==null")
	public Ticket getTicketById(Integer ticketId) {
		return ticketBookingDao.findById(ticketId).get();
	}

	@CacheEvict(value = "ticketsCache", key = "#ticketId")
	public void deleteTicket(Integer ticketId) {
		ticketBookingDao.deleteById(ticketId);
	}

	@CachePut(value = "ticketsCache", key = "#ticketId")
	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Ticket upadedTicket = null;
		Ticket ticketFromDb = ticketBookingDao.findById(ticketId).get();
		if (ticketFromDb != null) {
			ticketFromDb.setEmail(newEmail);
			upadedTicket = ticketBookingDao.save(ticketFromDb);
		}
		return upadedTicket;
	}
}
