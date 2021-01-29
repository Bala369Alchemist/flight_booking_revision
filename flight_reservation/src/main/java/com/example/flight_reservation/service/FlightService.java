package com.example.flight_reservation.service;

import java.sql.Date;
import java.util.List;

import com.example.flight_reservation.entity.Flight;

public interface FlightService {

	List<Flight> findFlights(String from, String to, Date date);

}
