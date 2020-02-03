package com.example.jwt.security.jwtauth.model;

import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class AuthResponse {
	private String token;
}