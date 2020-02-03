package com.example.jwt.security.jwtauth.model;

import lombok.*;

@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class  AuthRequest {
	private String username;
	private String password;
}