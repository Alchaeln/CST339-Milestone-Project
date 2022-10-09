package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RegisterModel {
	@NotNull(message="First name is a required field")
	@Size(min=1, max=32, message="First name must be between 1 and 32 characters")
	private String firstname;
	
	@NotNull(message="Last name is a required field")
	@Size(min=1, max=32, message="Last name must be between 1 and 32 characters")
	private String lastname;
	
	@NotNull(message="Username is a required field")
	@Size(min=1, max=32, message="Username must be between 1 and 32 characters")
	private String username;
	
	@NotNull(message="Phone Number is a required field")
	@Size(min=1, max=32, message="Phone Number must be between 1 and 32 characters")
	private String phonenumber;

	@NotNull(message="Password is a required field")
	@Size(min=1, max=32, message="Password must be between 1 and 32 characters")
	private String password;
	
	@NotNull(message="Email is a required field")
	@Size(min=1, max=32, message="Email must be between 1 and 32 characters")
	private String email;
	
	
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
