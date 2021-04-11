package com.eftomi.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eftomi.restapi.model.User;
import com.eftomi.restapi.repository.UserRepository;

@RestController
public class MainController {

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		return userRepository.save(user);
	}
	
	@GetMapping("/userslist")
	public Iterable<User> getAllUsers() {
		return userRepository.findAll();
	}
}
