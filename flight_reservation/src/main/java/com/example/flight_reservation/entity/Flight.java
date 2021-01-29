package com.example.flight_reservation.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "flights")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Flight extends AbstractEntity{

	@Column(name="flight_number")
	private String flightNumber;
	
	@Column(name="operating_airlines")
	private String operatingAirlines;
	
	@Column(name="departure_city")
	private String departureCity;
	
	@Column(name="arrival_city")
	private String arrivalCity;
	
	@Column(name="date_of_departure")
	@Temporal(TemporalType.DATE)
	private Date dateOfDeparture;
	
	@Column(name="estimated_departure_time")
	private Timestamp estimatedDepartureTime;
	
}
