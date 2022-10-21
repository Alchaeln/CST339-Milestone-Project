package com.gcu.business;

import java.util.List;

import com.gcu.model.OrderModel;

public interface OrdersBusinessServiceInterface {
	
	//return hard coded list of orders
	public List<OrderModel> getOrders();
	
	//make sure service is being initialized
	public void init();
	
	//make sure service is being initialized
	public void destroy();
}
