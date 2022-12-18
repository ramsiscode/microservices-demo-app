	package com.ramsis.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramsis.user.dto.ResponseTemplateDto;
import com.ramsis.user.entity.User;
import com.ramsis.user.service.UserService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	@PostMapping("/")
	public User saveUser(@RequestBody User user) {
		log.info("Inside saveUser method of UserController.");
		return userService.saveUser(user);
	}
	
	@GetMapping("/{id}")
	public User findDepartmentById(@PathVariable("id") Long userId) {
		log.info("Inside findUserById method of UserController.");
		return userService.findUserById(userId);
	}
	
	@GetMapping("getUserWithDepartment/{id}")
	public ResponseTemplateDto getUserWithDepartment(@PathVariable("id") Long userId) {
		log.info("Inside getUserWithDepartment method of UserController.");
		return userService.getUserWithDepartment(userId);
	}
}
