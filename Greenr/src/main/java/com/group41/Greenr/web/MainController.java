package com.group41.Greenr.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	// @GetMapping is used to handle GET type of request method
	@GetMapping("/login") 
	public String login() {
		return "login";
	}
}
