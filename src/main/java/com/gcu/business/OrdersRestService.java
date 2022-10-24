package com.gcu.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.model.OrderList;
import com.gcu.model.OrderModel;

/**
 * OrdersRestService allows the return of JSON and XML formatted orders list
 * @author Edu and Chael
 */
@RestController
@RequestMapping("/service")
public class OrdersRestService {
	
	//initialize service variable
	@Autowired
	private OrdersBusinessServiceInterface service;
	
	/**
	 * Returns JSON version of orders
	 * @return service.getOrders()
	 */
	@GetMapping(path="/getjson", produces= {MediaType.APPLICATION_JSON_VALUE})
	public List<OrderModel> getOrdersAsJson()
	{
		return service.getOrders();
	}
	
	/**
	 * Returns XML format list of orders
	 * @return return list
	 */
	@GetMapping(path="/getxml", produces= {MediaType.APPLICATION_XML_VALUE})
	public OrderList getOrdersAsXml()
	{
		OrderList list = new OrderList();
		list.setOrders(service.getOrders());
		return list;
	}
}
