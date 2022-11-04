package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Model for register to get input from register page
 * @author Edu and Chael
 */
public class RegisterModel {
	//initialize variables with validation requirements 
	@NotNull(message="First name is a required field")
	@Size(min=1, max=32, message="First name must be between 1 and 32 characters")
	private String firstname;
	
	@NotNull(message="Last name is a required field")
	@Size(min=1, max=32, message="Last name must be between 1 and 32 characters")
	private String lastname;
	
	@NotNull(message="Phone Number is a required field")
	@Size(min=1, max=32, message="Phone Number must be between 1 and 32 characters")
	private String phonenumber;
	
	@NotNull(message="Email is a required field")
	@Size(min=1, max=32, message="Email must be between 1 and 32 characters")
	private String email;
	
	@NotNull(message="Username is a required field")
	@Size(min=1, max=32, message="Username must be between 1 and 32 characters")
	private String username;
	
	@NotNull(message="Password is a required field")
	@Size(min=1, max=32, message="Password must be between 1 and 32 characters")
	private String password;
	
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
	/**
	 * public getter for phone number
	 * @return phoneNumber
	 */
	public String getPhonenumber() {
		return phonenumber;
	}
	/**
	 * public setter for phone number
	 * @param phonenumber
	 */
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	/**
	 * public getter for first name
	 * @return firstName
	 */
	public String getFirstname() {
		return firstname;
	}
	/**
	 * public setter for first name
	 * @param firstname
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	/**
	 * public getter for last name
	 * @return lastName
	 */
	public String getLastname() {
		return lastname;
	}
	/**
	 * public setter for last name
	 * @param lastname
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	/**
	 * public getter for email
	 * @return email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * public setter for email
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
}
