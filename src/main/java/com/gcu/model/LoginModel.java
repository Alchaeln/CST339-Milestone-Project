package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Contains all login model variables and methods to display login page
 * @author Edu and Chael
 */
public class LoginModel {
	//creates variables with conditions that it must not be null and size must be between 1 and 32 characters
	@NotNull(message="Username is a required field")
	@Size(min=1, max=32, message="Username must be between 1 and 32 characters")
	private String username;
	
	@NotNull(message="Password is a required field")
	@Size(min=1, max=32, message="Password must be between 1 and 32 characters")
	private String password;
	
	/**
	 * public getter for private variable username
	 * @return username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * public setter for private variable username
	 * @param username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * public getter for private variable password
	 * @return password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * public setter for private variable password
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}
}
