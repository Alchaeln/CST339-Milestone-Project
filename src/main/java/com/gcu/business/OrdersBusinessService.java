package com.gcu.business;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

import com.gcu.data.DataAccessInterface;
import com.gcu.model.OrderModel;

/**
 * OrdersBusinessService has a method to return order list and default init and destroy methods.
 * @author Edu and Chael
 */
public class OrdersBusinessService implements OrdersBusinessServiceInterface{
	

	@Autowired
	DataAccessInterface<OrderModel> service;

	/**
	 * returns the order list from data access service
	 * @return orders
	 */
	public List<OrderModel> getOrders() {
		return service.findAll();
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
