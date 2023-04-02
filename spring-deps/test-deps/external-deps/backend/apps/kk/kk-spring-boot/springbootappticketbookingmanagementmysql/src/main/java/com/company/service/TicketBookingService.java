package com.company.service;

import com.company.dao.TicketBookingDao;
import com.company.entities.Ticket;
import org.springframework.stereotype.Service;

@Service
public class TicketBookingService {

	private final TicketBookingDao ticketBookingDao;

	public TicketBookingService(TicketBookingDao ticketBookingDao) {
		this.ticketBookingDao = ticketBookingDao;
	}

	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDao.save(ticket);
	}

	public Ticket getTicketById(Integer ticketId) {
		return ticketBookingDao.findById(ticketId).get();
	}

	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingDao.findAll();
	}

	public void deleteTicket(Integer ticketId) {
		ticketBookingDao.deleteById(ticketId);
	}

	public Ticket updateTicket(Integer ticketId, String newEmail) {
		Ticket ticketFromDb = ticketBookingDao.findById(ticketId).get();
		ticketFromDb.setEmail(newEmail);
		Ticket upadedTicket = ticketBookingDao.save(ticketFromDb);
		return upadedTicket;
	}
}
