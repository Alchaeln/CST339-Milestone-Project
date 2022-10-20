package com.gcu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.model.LoginModel;
import com.gcu.model.OrderModel;

@Controller
//Sets up URI for localhost:8080/login
@RequestMapping("/login")
public class LoginController {
	
	//Sets up URI for localhost:8080/login/
	@GetMapping("/")
	public String display(Model model) 
	{
		//adds attributes of title and loginModel to be shown in the web page
		model.addAttribute("title", "Login Form");
		model.addAttribute("loginModel", new LoginModel());
		return "login";
	}
	
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
		
		//create list of items
		List<OrderModel> orders = new ArrayList<OrderModel>();
		orders.add(new OrderModel(0L,"Rengoku Sword", 150000.00f, 1));
		orders.add(new OrderModel(1L,"ODM Gear", 1000.00f, 1200));
		orders.add(new OrderModel(2L,"Dragon Ball", 9999999.00f, 7));
		orders.add(new OrderModel(3L,"Sukuna's Finger", 5000.00f, 20));
		orders.add(new OrderModel(4L,"Dragon Handle", 100000.00f, 1));
		
		//gets username and adds title that the user is logged in as "username"
		model.addAttribute("title", String.format("You are logged in as %s", loginModel.getUsername()) + "!");
		//passes order list that was just made to orders page
		model.addAttribute("orders", orders);

		//print out username and password to console
		System.out.println(String.format("Logged in with Username of %s and Password of %s",loginModel.getUsername(), loginModel.getPassword()));
		return "orders";
	}
	
	

}
