package com.gcu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gcu.business.ProductsBusinessServiceInterface;
import com.gcu.data.DataAccessInterface;
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
	private ProductsBusinessServiceInterface service;
	@Autowired
	private DataAccessInterface<ProductModel> dataService;
	
	/**
	 * basic product page
	 * @param model
	 * @return newProduct view
	 */
	@GetMapping("/products")
	public String display(Model model) 
	{
		model.addAttribute("title", "The Products");
		model.addAttribute("productModel", service.getProducts());
		return "products";
	}
	
	/**
	 * Method for displaying product page
	 * @param model
	 * @return Product view
	 */
	//Sets up URI for localhost:8080/enterProduct/
	@GetMapping("/enterProduct")
	public String enterProduct(Model model) 
	{
		//adds attributes of title and productModel to be shown in the web page
		model.addAttribute("title", "Add a Product");
		model.addAttribute("productModel", new ProductModel());
		return "newProduct";
	}
	
	/**
	 * validates and adds product
	 * @param productModel
	 * @param bindingResult
	 * @param model
	 * @return newProduct view
	 */
	@PostMapping("/addProduct")
	//@Valid checks that the product model is valid
	public String addProduct(@Valid ProductModel productModel, BindingResult bindingResult,Model model) 
	{
		//if product is invalid, send back to product page
		if(bindingResult.hasErrors()) 
		{
			model.addAttribute("title", "Did not add product!");
			model.addAttribute("productModel", new ProductModel());
			return "newProduct";
		}
		
		dataService.create(productModel);
		
		model.addAttribute("title", "Added Product!");
		model.addAttribute("productModel", service.getProducts());
		
		return "products";
	}
	
	/**
	 * Method for displaying product page
	 * @param model
	 * @return Product view
	 */
	//Sets up URI for localhost:8080/enterProduct/
	@GetMapping("/updateProduct")
	public String updateProduct(Model model) 
	{
		//adds attributes of title and productModel to be shown in the web page
		model.addAttribute("title", "Update a Product");
		model.addAttribute("productModel", new ProductModel());
		return "updateProduct";
	}
	
	/**
	 * validates and updates product
	 * @param productModel
	 * @param bindingResult
	 * @param model
	 * @return newProduct view
	 */
	@PostMapping("/doUpdateProduct")
	//@Valid checks that the product model is valid
	public String doUpdateProduct(@Valid ProductModel productModel, BindingResult bindingResult,Model model) 
	{
		//if product is invalid, send back to product page
		if(bindingResult.hasErrors()) 
		{
			model.addAttribute("title", "Did not update product!");
			model.addAttribute("productModel", new ProductModel());
			return "updateProduct";
		}
		
		dataService.update(productModel);
		
		model.addAttribute("title", "Updated Product!");
		model.addAttribute("productModel", service.getProducts());
		
		return "products";
	}
	
	/**
	 * Method for displaying product page
	 * @param model
	 * @return Product view
	 */
	//Sets up URI for localhost:8080/enterProduct/
	@GetMapping("/deleteProduct")
	public String deleteProduct(Model model) 
	{
		//adds attributes of title and productModel to be shown in the web page
		model.addAttribute("title", "Delete a Product");
		model.addAttribute("productModel", new ProductModel());
		return "deleteProduct";
	}
	
	/**
	 * validates and deletes product
	 * @param productModel
	 * @param bindingResult
	 * @param model
	 * @return newProduct view
	 */
	@PostMapping("/doDeleteProduct")
	//@Valid checks that the product model is valid
	public String doDeleteProduct(@Valid ProductModel productModel, BindingResult bindingResult,Model model) 
	{
		//if product is invalid, send back to product page
		if(bindingResult.hasErrors()) 
		{
			model.addAttribute("title", "Did not delete product!");
			model.addAttribute("productModel", new ProductModel());
			return "deleteProduct";
		}
		
		dataService.delete(productModel);
		
		model.addAttribute("title", "Deleted Product!");
		model.addAttribute("productModel", service.getProducts());
		
		return "products";
	}
}
