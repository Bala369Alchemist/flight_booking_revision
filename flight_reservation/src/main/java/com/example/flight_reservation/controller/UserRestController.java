package com.example.flight_reservation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.flight_reservation.entity.User;
import com.example.flight_reservation.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserRestController {

	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/registration")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
}
