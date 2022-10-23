package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import com.gcu.model.OrderModel;
import com.gcu.model.ProductModel;

/**
 * OrdersBusinessService has a method to return order list and default init and destroy methods.
 * @author Edu and Chael
 */
public class OrdersBusinessService implements OrdersBusinessServiceInterface{

	/**
	 * creates hard coded list of orders and returns the list
	 * @returns orders
	 */
	public List<OrderModel> getOrders() {
		List<OrderModel> orders = new ArrayList<OrderModel>();
		orders.add(new OrderModel(1,0L,"Rengoku Sword", 150000.00f, 1));
		orders.add(new OrderModel(2,1L,"ODM Gear", 1000.00f, 12000));
		orders.add(new OrderModel(3,2L,"Dragon Ball", 9999999.00f, 7));
		orders.add(new OrderModel(4,3L,"Sukuna's Finger", 5000.00f, 20));
		orders.add(new OrderModel(5,4L,"Dragon Handle", 100000.00f, 1));
		return orders;
	}
	
	@Override
	public List<ProductModel> getProducts() {
		List<ProductModel> products = new ArrayList<ProductModel>();
		products.add(new ProductModel(0L, "Product 1", 100.00f, 1));
		products.add(new ProductModel(1L, "Product 2", 200.00f, 2));
		products.add(new ProductModel(2L, "Product 3", 300.00f, 3));
		products.add(new ProductModel(3L, "Product 4", 400.00f, 4));
		products.add(new ProductModel(4L, "Product 5", 500.00f, 5));
		return products;
	}

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
