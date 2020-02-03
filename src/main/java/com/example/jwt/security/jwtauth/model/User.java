package com.example.jwt.security.jwtauth.model;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.jwt.security.jwtauth.constants.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.*;

@ToString @AllArgsConstructor @NoArgsConstructor
@Table("users")
public class User implements UserDetails {
	@Id
	private String username;
	private String password;
	
//	@Getter @Setter
//	private Boolean enabled;
	
	@Getter @Setter
	private String roles;
	
	
	public User(String username) {
		this.username = username;
	}
	
	@Override
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	@Override
	public boolean isAccountNonExpired() {
		return false;
	}
	@Override
	public boolean isAccountNonLocked() {
		return false;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}
	@Override
	public boolean isEnabled() {
		return true;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		
		return Arrays.asList(this.roles.split(",")).stream()
				.map(role -> Enum.valueOf(Role.class, role))
				.map(authority -> new SimpleGrantedAuthority(authority.name())).collect(Collectors.toList());
	}
	
	@JsonIgnore
	@Override
	public String getPassword() {
		return password;
	}
	@JsonProperty
	public void setPassword(String password) {
		this.password = password;
	}
}