package com.example.jwt.security.jwtauth.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.example.jwt.security.jwtauth.model.Employee;

public interface EmployeeRepository extends ReactiveCrudRepository<Employee, Long>{

}
