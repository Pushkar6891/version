package com.company;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.company.entities.Ticket;
import com.company.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication
				.run(TicketBookingManagementApplication.class, args);

		TicketBookingService ticketBookingService = applicationContext.getBean("ticketBookingService",
				TicketBookingService.class);

		Ticket ticket = new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setDestStation("Mumbai");
		ticket.setSourceStation("Pune");
		ticket.setPassengerName("KK");
		ticket.setEmail("kk@yahoo.com");

		ticketBookingService.createTicket(ticket);
	}
}
