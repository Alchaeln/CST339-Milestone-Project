package com.gcu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.OrdersBusinessServiceInterface;
import com.gcu.model.LoginModel;

/**
 * Has all the routes for the login page with root /login
 * @author Edu and Chael
 */
@Controller
//Sets up URI for localhost:8080/login
@RequestMapping("/login")
public class LoginController {
	
	//initialize OrdersBusinessService
	@Autowired
	private OrdersBusinessServiceInterface service;
	
	/**
	 * Method for displaying login page
	 * @param model
	 * @return login view
	 */
	//Sets up URI for localhost:8080/login/
	@GetMapping("/")
	public String display(Model model) 
	{
		//adds attributes of title and loginModel to be shown in the web page
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new LoginModel());
		return "login";
	}
	
	/**
	 * Logs the user in and shows the orders page if successful
	 * @param loginModel
	 * @param bindingResult
	 * @param model
	 * @return
	 */
	//Sets up URI for localhost:8080/login/doLogin
	@PostMapping("/doLogin")
	//@Valid checks that the username and password are valid
	public String doLogin(@Valid LoginModel loginModel, BindingResult bindingResult, Model model) 
	{
		//if username or password is invalid, send back to login page
		if(bindingResult.hasErrors()) 
		{
			model.addAttribute("title", "Login Form");
			return "login";
		}
		
		//gets username and adds title that the user is logged in as "username"
		model.addAttribute("title", String.format("You are logged in as %s", loginModel.getUsername()) + "!");
		//passes order list that was just made to orders page
		model.addAttribute("orders", service.getOrders());

		//print out username and password to console
		System.out.println(String.format("Logged in with Username of %s and Password of %s",loginModel.getUsername(), loginModel.getPassword()));
		return "orders";
	}
	
	

}
