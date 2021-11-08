package com.ankur.userservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "User")
public class User {

	public User(String string, String string2, String string3,Long x) {
		// TODO Auto-generated constructor stub
		firstName = string;
		lastName = string2;
		email = string3;
		departmentId = x;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	private Long userId;
	private String firstName;
	private String lastName;
	private String email;
	private Long departmentId;
}
