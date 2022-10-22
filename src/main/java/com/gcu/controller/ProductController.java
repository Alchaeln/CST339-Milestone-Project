package com.gcu.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	/**
	 * Method for displaying product page
	 * @param model
	 * @return newProduct view
	 */
	//Sets up URI for localhost:8080/login/
	@GetMapping("/addproduct")
	public String display(Model model) 
	{
		List<ProductModel> products = new ArrayList<ProductModel>();
		products.add(new ProductModel(0L, "Product 1", 100.00f, 1));
		products.add(new ProductModel(1L, "Product 2", 200.00f, 2));
		products.add(new ProductModel(2L, "Product 3", 300.00f, 3));
		products.add(new ProductModel(3L, "Product 4", 400.00f, 4));
		products.add(new ProductModel(4L, "Product 5", 500.00f, 5));
	
		model.addAttribute("title", "The Products");
		model.addAttribute("productModel", products);
		return "newProduct";
	}
}
