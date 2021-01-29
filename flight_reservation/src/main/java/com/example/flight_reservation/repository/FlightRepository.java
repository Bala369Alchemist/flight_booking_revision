package com.example.flight_reservation.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.flight_reservation.entity.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

	@Query(" FROM Flight where departureCity=:from and arrivalCity=:to and dateOfDeparture=:date")
	List<Flight> findFlights(String from, String to, Date date);

}
