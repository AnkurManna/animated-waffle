package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/userServiceFallBack")
	public String userServiceFallBackMethod()
	{
		return 
		"User Service is taking longer than expected " + "Try again Later";
		
	}
	
	@GetMapping("/departmentServiceFallBack")
	public String departmentServiceFallBackMethod()
	{
		return 
		"Department Service is taking longer than expected " + "Try again Later";
		
	}
}
