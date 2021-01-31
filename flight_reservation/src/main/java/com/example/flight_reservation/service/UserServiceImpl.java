package com.example.flight_reservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.flight_reservation.entity.User;
import com.example.flight_reservation.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public User addUser(User user) {
		User userExist = userRepo.findByEmail(user.getEmail());
		if(userExist == null) {
			return userRepo.save(user);
		}
		return null;
	}
	
}
