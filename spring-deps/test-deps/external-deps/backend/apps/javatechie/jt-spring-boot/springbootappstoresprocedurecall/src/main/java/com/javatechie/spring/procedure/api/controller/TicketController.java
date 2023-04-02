package com.javatechie.spring.procedure.api.controller;

import com.javatechie.spring.procedure.api.dao.TicketDao;
import com.javatechie.spring.procedure.api.model.Ticket;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TicketController {

	private final TicketDao dao;

	public TicketController(TicketDao dao) {
		this.dao = dao;
	}

	@GetMapping("/findTicket")
	public List<Ticket> findTickets() {
		return dao.getTicketInfo();
	}

	@GetMapping("/findTicketByCategory/{category}")
	public List<Ticket> findTicketsByCategory(@PathVariable String category) {
		return dao.getTicketInfoByCategory(category);
	}
}
