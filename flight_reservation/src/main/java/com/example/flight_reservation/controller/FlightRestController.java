package com.example.flight_reservation.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flight_reservation.entity.Flight;
import com.example.flight_reservation.service.FlightService;

@RestController
@RequestMapping(value = "/flights")
public class FlightRestController {

	@Autowired
	private FlightService flightService;
	
	@GetMapping(value = "/findFlights/from/{from}/to/{to}/date/{date}")
	public List<Flight> findFlights(@PathVariable String from,@PathVariable String to,@PathVariable Date date){
		return flightService.findFlights(from,to,date);
	}
	
}
