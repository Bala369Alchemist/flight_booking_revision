package com.example.flight_reservation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.flight_reservation.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
