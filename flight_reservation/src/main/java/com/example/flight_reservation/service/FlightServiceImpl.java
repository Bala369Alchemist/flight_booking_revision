package com.example.flight_reservation.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flight_reservation.entity.Flight;
import com.example.flight_reservation.repository.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightRepository flightRepo;

	@Override
	public List<Flight> findFlights(String from, String to, Date date) {
		return flightRepo.findFlights(from, to, date);
	}
	
	
	
}
