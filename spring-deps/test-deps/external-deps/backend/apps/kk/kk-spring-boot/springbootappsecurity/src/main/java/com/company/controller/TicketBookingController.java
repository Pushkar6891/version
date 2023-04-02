package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.entities.Ticket;
import com.company.service.TicketBookingService;

@RestController
@RequestMapping(value = "/api")
public class TicketBookingController {

	@Autowired
	private TicketBookingService ticketBookingService;

	@PostMapping(value = "/admin/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
	}

	@GetMapping(value = "/tickets/ticketId/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId") Integer ticketId) {
		return ticketBookingService.getTicketById(ticketId);
	}

	@GetMapping(value = "/tickets/alltickets")
	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingService.getAllBookedTickets();
	}

	@DeleteMapping(value = "/admin/ticketId/{ticketId}")
	public void deleteTicketById(@PathVariable("ticketId") Integer ticketId) {
		ticketBookingService.deleteTicket(ticketId);
	}

	@PutMapping(value = "/admin/ticketId/{ticketId}/email/{newEmail:.+}")
	public Ticket updateTicketByIdAndEmail(@PathVariable("ticketId") Integer ticketId,
			@PathVariable("newEmail") String newEmail) {
		return ticketBookingService.updateTicket(ticketId, newEmail);
	}
}
