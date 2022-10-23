package com.gcu.business;

import java.util.List;

import com.gcu.model.OrderModel;
import com.gcu.model.ProductModel;

public interface OrdersBusinessServiceInterface {
	
	/**
	 * returns hard coded list of orders
	 * @return orders
	 */
	public List<OrderModel> getOrders();
	
	/**
	 * returns hard coded list of products
	 * @return orders
	 */
	public List<ProductModel> getProducts();
	
	/**
	 * make sure service is being initialized
	 */
	public void init();
	
	/**
	 * make sure service is being initialized
	 */
	public void destroy();
}
