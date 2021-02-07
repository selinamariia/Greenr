package com.group41.Greenr.web;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.group41.Greenr.repository.UserRepo;
import com.group41.Greenr.service.UserService;

@Controller
public class MainController {
	
	@Autowired
	private UserService userService;
	@Autowired
	private UserRepo userRepo;
	
	// @GetMapping is used to handle GET type of request method
	@GetMapping("/login") 
	public String login() {
		return "login";
	}
	
	@GetMapping("/profile") 
	public String profilepage() {
		return "profile";
	}
	
	@RequestMapping("/deletebyuser")
    public String currentLoggedInUsername(Principal principal) {
        String email = principal.getName();
        Long userID= userRepo.findByEmail(email).getId();
        userRepo.deleteById(userID);
        return "redirect:/login";
    }
		
}
