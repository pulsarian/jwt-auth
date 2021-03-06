package com.example.jwt.security.jwtauth.functional.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.ReactiveSecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;


import reactor.core.publisher.Mono;

//@Component
public class LoginHandler {
	/*
	@Autowired
	private JWTUtil jwtUtil;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PBKDF2Encoder passwordEncoder;
	
	
	
	public Mono<ServerResponse> doLogin(ServerRequest serverRequest) {
		
		Mono<AuthRequest> request = serverRequest.bodyToMono(AuthRequest.class);
		
		return request.flatMap(item -> 
			ServerResponse.ok()
			.contentType(MediaType.APPLICATION_JSON)
			.body(
					userRepository.findById(item.getUsername()).map(userDetails -> {
						if (passwordEncoder.encode(item.getPassword()).equals(userDetails.getPassword())) {
							return ResponseEntity.ok(new AuthResponse(jwtUtil.generateToken(userDetails)));
						} else {
							return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
						}
					})
					.defaultIfEmpty(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build()), AuthRequest.class)
			);	*/
	}
