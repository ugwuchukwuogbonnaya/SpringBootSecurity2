package com.casmir.org.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {
	

	@GetMapping("/home")
	public String showHomePage () {
		return "displaying the admin home page contents";
	}
	
	@GetMapping("/protected")
	public String protectedPage () {
		return "displaying the admin  protected page contents";
	}


}
