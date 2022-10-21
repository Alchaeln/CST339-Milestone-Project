package com.gcu.business;

import java.util.ArrayList;
import java.util.List;

import com.gcu.model.OrderModel;

public class OrdersBusinessService implements OrdersBusinessServiceInterface{

	public List<OrderModel> getOrders() {
		// TODO Auto-generated method stub
		List<OrderModel> orders = new ArrayList<OrderModel>();
		orders.add(new OrderModel(0L,"Rengoku Sword", 150000.00f, 1));
		orders.add(new OrderModel(1L,"ODM Gear", 1000.00f, 12000));
		orders.add(new OrderModel(2L,"Dragon Ball", 9999999.00f, 7));
		orders.add(new OrderModel(3L,"Sukuna's Finger", 5000.00f, 20));
		orders.add(new OrderModel(4L,"Dragon Handle", 100000.00f, 1));
		return orders;
	}

	public void init() {
		System.out.println("INIT");
	}

	public void destroy() {
		System.out.println("DESTROY");
	}
}
