package com.example.jwt.security.jwtauth.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.jwt.security.jwtauth.model.Message;

import reactor.core.publisher.Mono;


@RestController
public class ResourceController {
	
	@RequestMapping(value = "/resource/user", method = RequestMethod.GET)
	@PreAuthorize("hasRole('ROLE_USER')")
	public Mono<ResponseEntity<?>> user() {
		return Mono.just(ResponseEntity.ok(new Message("Content for user")));
	}
	
	@RequestMapping(value = "/resource/admin", method = RequestMethod.GET)
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public Mono<ResponseEntity<?>> admin() {
		return Mono.just(ResponseEntity.ok(new Message("Content for admin")));
	}
	
	@RequestMapping(value = "/resource/user-or-admin", method = RequestMethod.GET)
	@PreAuthorize("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
	public Mono<ResponseEntity<?>> userOrAdmin() {
		return Mono.just(ResponseEntity.ok(new Message("Content for user or admin")));
	}
}