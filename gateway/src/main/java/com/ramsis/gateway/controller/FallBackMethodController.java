package com.ramsis.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class FallBackMethodController {

	@GetMapping("/userServiceFallbackMethod")
	public String userServiceFallbackMethod() {
		return "User Service is taking longer than Expected. Please try again later";
	}
	
	@GetMapping("/departmentServiceFallbackMethod")
	public String departmentServiceFallbackMethod() {
		return "department Service is taking longer than Expected. Please try again later";
	}
}
