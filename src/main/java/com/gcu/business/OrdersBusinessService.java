package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.DataAccessInterface;
import com.gcu.model.OrderModel;
import com.gcu.model.ProductModel;

/**
 * OrdersBusinessService has a method to return order list and default init and destroy methods.
 * @author Edu and Chael
 */
public class OrdersBusinessService implements OrdersBusinessServiceInterface{
	

	@Autowired
	DataAccessInterface<OrderModel> service;

	/**
	 * creates hard coded list of orders and returns the list
	 * @return orders
	 */

	public List<OrderModel> getOrders() {
		
		return service.findAll();
	}
	
	/**
	 * creates hard coded list of products and returns the list
	 * @return products
	 */
	/**
	public List<ProductModel> getProducts() {
		
		List<ProductModel> products = new ArrayList<ProductModel>(); //fix this one to add to database
		products.add(new ProductModel(0L, "Product 1", 100.00f, 1));
		products.add(new ProductModel(1L, "Product 2", 200.00f, 2));
		products.add(new ProductModel(2L, "Product 3", 300.00f, 3));
		products.add(new ProductModel(3L, "Product 4", 400.00f, 4));
		products.add(new ProductModel(4L, "Product 5", 500.00f, 5));
		return products;
		
		
		return service.findAll();
	}
		**/

	/**
	 * Console output to make sure OrdersBusinessService is being initialized
	 */
	@PostConstruct
	public void init() {
		System.out.println("INIT");
	}

	/**
	 * Console output to make sure OrdersBusinessService is being destroyed
	 */
	@PreDestroy
	public void destroy() {
		System.out.println("DESTROY");
	}


}
