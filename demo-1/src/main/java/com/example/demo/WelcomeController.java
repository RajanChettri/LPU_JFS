package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	
	
	@RequestMapping("/welcome")
	public String greet() {
		return "Congratulations! On Running Your First App";
	}
	
}
