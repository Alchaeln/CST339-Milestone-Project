package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.gcu.model.UserModel;

/**
 * Has all the routes for the login page with root /login
 * 
 * @author Edu and Chael
 */
@Controller
//Sets up URI for localhost:8080/login
public class LoginController {

	/**
	 * Sets up login page
	 * @param model
	 * @return login page
	 */
	@GetMapping("/login")
	public String display(Model model) 
	{
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new UserModel());
		return "login";
	}
}
