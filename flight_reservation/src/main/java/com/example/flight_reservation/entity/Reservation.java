package com.example.flight_reservation.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="reservations")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation extends AbstractEntity{

	@Column(name = "checked_in")
	private boolean checkedIn;
	
	@Column(name = "number_of_bags")
	private int numberOfBags;
	
	@OneToOne
	Passenger passenger;
	
	@OneToOne
	Flight flight;
	
}
