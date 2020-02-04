package com.example.jwt.security.jwtauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwt.security.jwtauth.model.Employee;
import com.example.jwt.security.jwtauth.model.User;
import com.example.jwt.security.jwtauth.repository.EmployeeRepository;
import com.example.jwt.security.jwtauth.repository.UserRepository;

import reactor.core.publisher.Flux;

@RestController
public class RepoTestController {
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/users")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public Flux<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	@GetMapping("/employees")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public Flux<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
}
