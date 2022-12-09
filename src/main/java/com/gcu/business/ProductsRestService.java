package com.gcu.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.model.ProductModel;

/**
 * OrdersRestService allows the return of JSON and XML formatted Products list
 * @author Edu and Chael
 */
@RestController
@RequestMapping("/service")
public class ProductsRestService {
	
	//initialize service variable
	@Autowired
	private ProductsBusinessServiceInterface service;
	
	/**
	 * Returns JSON version of Products
	 * @return service.getProducts()
	 */
	@GetMapping(path="/products", produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<ProductModel> getProducts()
	{
		//returns all products in a json format
		return service.getProducts();
	}	
	
	/**
	 * Returns JSON version of Products
	 * @return service.getProducts()
	 */
	@GetMapping(path="/product", produces= {MediaType.APPLICATION_JSON_VALUE})
	public ProductModel getProduct(long id)
	{
		//returns a specific product in a json format
		return service.getProduct(id);
	}	
}
