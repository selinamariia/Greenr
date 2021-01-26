package com.group41.greenr.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.group41.greenr.model.Role;
import com.group41.greenr.model.User;
import com.group41.greenr.repository.UserRepo;
import com.group41.greenr.web.dto.UserRegistrationDto;

@Service
public class UserServiceImplement implements UserService{

	private UserRepo userRepo;
	
	public UserServiceImplement(UserRepo userRepo) {
		super();
		this.userRepo = userRepo;
	}

	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user = new User(registrationDto.getFirstName(), 
				registrationDto.getLastName(), registrationDto.getEmail(), 
				registrationDto.getPassword(), registrationDto.getPhoneNumber(), 
				Arrays.asList(new Role("ROLE_USER")));
		
		return userRepo.save(user);
	}
}
