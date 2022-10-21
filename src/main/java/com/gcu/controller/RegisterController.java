package com.gcu.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.model.LoginModel;
import com.gcu.model.RegisterModel;

/**
 * controls all of the register page routes
 * @author Edu and Chael
 */
@Controller
//Sets up URI for localhost:8080/register
@RequestMapping("/register")
public class RegisterController {

	/**
	 * add attributes to model and returns register view
	 * @param model
	 * @return register view
	 */
	//Sets up URI for localhost:8080/register/
	@GetMapping("/")
	public String display(Model model) 
	{
		//adds title and register model to be displayed
		model.addAttribute("title", "Register Form");
		model.addAttribute("registerModel", new RegisterModel());
		return "register";
	}
	
	/**
	 * verifies inputs and continues to login page if inputs are valid
	 * @param registerModel
	 * @param bindingResult
	 * @param model
	 * @return login view
	 */
	//Sets up URI for localhost:8080/register/doRegister
	@PostMapping("/doRegister")
	//@Valid checks that all inputs are valid
	public String doRegister(@Valid RegisterModel registerModel, BindingResult bindingResult, Model model) 
	{
		//if an input is invalid, send back to register page
		if(bindingResult.hasErrors()) 
		{
			model.addAttribute("title", "Register Form");
			return "register";
		}
		
		//creates login model
		LoginModel login = new LoginModel();
		//adds title and login model to model for web page
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", login);
		
		//prints inputs into console
		System.out.println(String.format("New User created with %s user name, %s password, %s %s name, %s phone number, %s email",
				registerModel.getUsername(), 
				registerModel.getPassword(), 
				registerModel.getFirstname(), 
				registerModel.getLastname(), 
				registerModel.getPhonenumber(), 
				registerModel.getEmail()));
	
		return "login";
		

	}
	
}
