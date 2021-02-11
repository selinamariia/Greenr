package com.group41.Greenr.web;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.group41.Greenr.model.User;
import com.group41.Greenr.service.UserService;
import com.group41.Greenr.web.dto.UserRegistrationDto;

@Controller
@RequestMapping("/profile")
public class ProfileController {
	
	private UserService userService;

	public ProfileController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	///////////// below related to front-end testing
	@ModelAttribute("user")
	public UserRegistrationDto userRegistrationDto() {
		return new UserRegistrationDto();
	}
	
	// @GetMapping is used to handle GET type of request method
	@GetMapping
	public String showProfileForm() {
	return "profile";
	}
	

	
	///////////// above related to front-end testing
	
	
	// @PostMapping is used to handle POST type of request method
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}

}
