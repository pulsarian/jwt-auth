package com.example.jwt.security.jwtauth.model;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table("employee")
public class Employee {
	@Column("emp_id")
	private Long employeeId;
	@Column("emp_name")
	private String employeeName;
	@Column("emp_bu")
	private String businessUnit;
	@Column("emp_mail")
	private String email;
	@Column("emp_contact")
	private String contactNo;
	@Column("emp_username")
	private String username;
	@Column("emp_password")
	private String password;
	@Column("emp_roles")
	private String roles;
}
