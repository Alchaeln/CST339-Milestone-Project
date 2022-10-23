package com.gcu.controller;

import java.util.ArrayList;
import java.util.List;

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
import com.gcu.model.OrderModel;
import com.gcu.model.ProductModel;

/**
 * Has all the routes for the product page
 * @author Edu and Chael
 */
@Controller
//Sets up URI for localhost:8080/login
@RequestMapping("/")
public class ProductController {
	
	@Autowired
	private OrdersBusinessServiceInterface service;
	
	/**
	 * Method for displaying product page
	 * @param model
	 * @return newProduct view
	 */
	//Sets up URI for localhost:8080/login/
	@GetMapping("/addProduct")
	public String display(Model model) 
	{
		model.addAttribute("title", "The Products");
		model.addAttribute("productModel", service.getProducts());
		return "newProduct";
	}
	
	@PostMapping("/addProduct/product")
	//@Valid checks that the username and password are valid
	public String doLogin(@Valid ProductModel productModel, BindingResult bindingResult,Model model) 
	{
		//if username or password is invalid, send back to login page
		if(bindingResult.hasErrors()) 
		{
			model.addAttribute("title", "Did not add product!");
			model.addAttribute("productModel", service.getProducts());
			return "newProduct";
		}
		
		model.addAttribute("title", "Added Product");
		model.addAttribute("productModel", service.getProducts());
		return "newProduct";
	}
}
