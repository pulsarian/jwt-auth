package com.example.jwt.security.jwtauth.service;
import java.util.Arrays;
import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

/**
 *
 * @author ard333
 */
@Service
public class UserService {
	/*
	// this is just an example, you can load the user from the database from the repository
	
	//username:passwowrd -> user:user
	private final String userUsername = "user";// password: user
	private final User user = new User(userUsername, "user", Arrays.asList(Role.ROLE_USER));
	
	//username:passwowrd -> admin:admin
	private final String adminUsername = "admin";// password: admin
	private final User admin = new User(adminUsername, "admin", Arrays.asList(Role.ROLE_ADMIN));
	
	public Mono<User> findByUsername(String username) {
		if (username.equals(userUsername)) {
			return Mono.just(user);
		} else if (username.equals(adminUsername)) {
			return Mono.just(admin);
		} else {
			return Mono.empty();
		}
	}
	*/
}