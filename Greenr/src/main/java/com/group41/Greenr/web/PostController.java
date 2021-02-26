package com.group41.Greenr.web;

import java.io.IOException;
import java.security.Principal;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//import com.group41.Greenr.model.EmailApplication;
import com.group41.Greenr.model.User;
import com.group41.Greenr.repository.UserRepo;
import com.group41.Greenr.service.UserService;
import com.group41.Greenr.service.UserServiceImplement;
//import com.group41.Greenr.web.dto.UserRegistrationDto;


import java.io.IOException;
import java.security.Principal;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

@Controller
public class PostController 
{
	@Autowired
    private JavaMailSender javaMailSender;
	private UserService userService;
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private UserServiceImplement userServiceImplement;

	public PostController(UserService userService)
	{
		super();
		this.userService = userService;
	}
	
//	@PostMapping("/post")
//	public String savePost()
//	{
//		
//	}
}
