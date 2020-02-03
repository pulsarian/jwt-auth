package com.example.jwt.security.jwtauth.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.example.jwt.security.jwtauth.model.User;


@Repository
public interface UserRepository extends ReactiveCrudRepository<User, String> {

}
