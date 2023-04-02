package com.company.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ticket_id")
	private Integer ticketId;

	@Column(name = "passenger_name", nullable = false)
	private String passengerName;

	@Column(name = "booking_date", nullable = false)
	private Date bookingDate;

	@Column(name = "source_station", nullable = false)
	private String sourceStation;

	@Column(name = "dest_station", nullable = false)
	private String destStation;

	@Column(name = "email")
	private String email;
}
