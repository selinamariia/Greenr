package com.group41.Greenr.web;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.group41.Greenr.model.User;
import com.group41.Greenr.repository.UserRepo;
import com.group41.Greenr.service.UserService;
import com.group41.Greenr.service.UserServiceImplement;
//import com.group41.Greenr.web.dto.UserRegistrationDto;

@Controller
//@RequestMapping("/profile")
public class ProfileController {
	
	private UserService userService;
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private UserServiceImplement userServiceImplement;

	public ProfileController(UserService userService) {
		super();
		this.userService = userService;
	}
	

//	@ModelAttribute("user")
//	public UserRegistrationDto userRegistrationDto() {
//		return new UserRegistrationDto();
//	}
	
	// @GetMapping is used to handle GET type of request method
	@GetMapping
	public String showProfileForm() {
	return "profile";
	}
	

	@GetMapping("/profile")
    public String getUserProfile(Model model, Principal principal) {
        String email = principal.getName();
        Long userID= userRepo.findByEmail(email).getId();

        model.addAttribute("userprofile", userRepo.findById(userID).get());

        return "profile";
    }

	@PostMapping("/save")
    public String saveUser(@ModelAttribute("user") User user) {

        userServiceImplement.saveuser(user);
        return "redirect:/profile";
    }

	
//	// @PostMapping is used to handle POST type of request method
//	@PostMapping
//	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
//		userService.save(registrationDto);
//		return "redirect:/registration?success";
//	}

}
