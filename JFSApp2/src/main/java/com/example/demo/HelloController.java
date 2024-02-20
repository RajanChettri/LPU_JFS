package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	// now we will specify URL ROUTE

@GetMapping("/hello")
public String sayHello() {
	
	return "Hello From Spring BOOT APPLICATION- by Anonymous";
}

}
