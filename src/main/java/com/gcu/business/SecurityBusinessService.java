package com.gcu.business;

import org.springframework.stereotype.Service;

/**
 * SecurityBusinessService is used to authenticate username and password
 * @author Edu and Chael
 */
@Service
public class SecurityBusinessService {
	/**
	 * Placeholder authentication that returns true
	 * @param username
	 * @param password
	 * @return true
	 */
	 public boolean authenticateLogin(String username, String password) 
	 {
		 System.out.printf("Authenticated %s with password %s", username, password);
		 return true;
	 }
	 
	 public boolean authenticateRegister(String username, String password, String firstName, String lastName, String phoneNumber, String email) 
	 {
		 System.out.printf("Authenticated %s with password %s first name %s  last name %s phone number %s email %s", username, password, firstName, lastName, phoneNumber, email);
		 return true;
	 }
}
