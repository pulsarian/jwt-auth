package com.example.jwt.security.jwtauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableR2dbcRepositories
public class JwtAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtAuthApplication.class, args);
	}

}
