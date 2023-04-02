package com.company.service;

import com.company.dao.TicketBookingDao;
import com.company.entities.Ticket;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class TicketBookingService {

	private final TicketBookingDao ticketBookingDao;

	public TicketBookingService(TicketBookingDao ticketBookingDao) {
		this.ticketBookingDao = ticketBookingDao;
	}

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
		Ticket ticketFromDb = ticketBookingDao.findById(ticketId).get();
		ticketFromDb.setEmail(newEmail);
		return ticketBookingDao.save(ticketFromDb);
	}
}
