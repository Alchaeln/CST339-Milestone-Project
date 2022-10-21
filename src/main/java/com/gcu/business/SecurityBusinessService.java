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
	 public boolean authenticate(String username, String password) 
	 {
		 System.out.printf("Authenticated %d with password %d", username, password);
		 return true;
	 }
}
