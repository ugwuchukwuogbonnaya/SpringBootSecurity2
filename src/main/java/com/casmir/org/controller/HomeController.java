package com.casmir.org.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/user")
public class HomeController {
	
	@GetMapping("/home")
	public String showHomePage () {
		return "displaying the home page contents";
	}
	
	@GetMapping("/protected")
	public String protectedPage () {
		return "displaying the protected page contents";
	}

}
