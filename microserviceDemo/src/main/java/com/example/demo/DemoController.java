package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/servicedemo")
	public DemoModel retrieveValueFromConfiguration() {
		return new DemoModel(100,1);
	}
	
}
