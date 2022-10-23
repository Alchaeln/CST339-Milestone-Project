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
	@GetMapping("/enterProduct")
	public String addProduct(Model model) 
	{
		//adds attributes of title and loginModel to be shown in the web page
		model.addAttribute("title", "Add a Product!");
		model.addAttribute("productModel", new ProductModel());
		return "Product";
	}
	
	@GetMapping("/products")
	public String display(Model model) 
	{
		model.addAttribute("title", "The Products");
		model.addAttribute("productModel", service.getProducts());
		return "newProduct";
	}
	
	@PostMapping("/addProduct")
	//@Valid checks that the username and password are valid
	public String doLogin(@Valid ProductModel productModel, BindingResult bindingResult,Model model) 
	{
		//if product is invalid, send back to product page
		if(bindingResult.hasErrors()) 
		{
			model.addAttribute("title", "Did not add product!");
			model.addAttribute("productModel", new ProductModel());
			return "Product";
		}
		
		model.addAttribute("title", "Added Product!");
		model.addAttribute("productModel", service.getProducts());
		
		System.out.println(String.format("Logged in with Username of %s and Password of",productModel.getProductName()));
		
		return "newProduct";
	}
}
