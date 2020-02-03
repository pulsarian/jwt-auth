package com.example.jwt.security.jwtauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwt.security.jwtauth.model.User;
import com.example.jwt.security.jwtauth.repository.UserRepository;

import reactor.core.publisher.Flux;

@RestController
public class RepoTestController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public Flux<User> getAllUsers() {
		return userRepository.findAll();
	}
}
