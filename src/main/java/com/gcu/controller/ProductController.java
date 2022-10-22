package com.gcu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.model.ProductModel;

/**
 * Has all the routes for the product page
 * @author Edu and Chael
 */
@Controller
//Sets up URI for localhost:8080/login
@RequestMapping("/")
public class ProductController {
	
	/**
	 * Method for displaying product page
	 * @param model
	 * @return newProduct view
	 */
	//Sets up URI for localhost:8080/login/
	@GetMapping("/addProduct")
	public String display(Model model) 
	{
		//adds attributes of title and loginModel to be shown in the web page
		model.addAttribute("title", "Add Product");
		model.addAttribute("productModel", new ProductModel());
		return "newProduct";
	}
}
