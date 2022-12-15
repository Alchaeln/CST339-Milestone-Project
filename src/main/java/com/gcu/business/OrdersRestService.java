package com.gcu.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.model.OrderList;
import com.gcu.model.OrderModel;

/**
 * OrdersRestService allows the return of JSON and XML formatted orders list
 * 
 * @author Edu and Chael
 */
@RestController
@RequestMapping("/service")
public class OrdersRestService {

	// initialize service variable
	@Autowired
	private OrdersBusinessServiceInterface service;

	/**
	 * Returns JSON version of orders
	 * 
	 * @return service.getOrders()
	 */
	@GetMapping(path = "/getjson", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> getOrdersAsJson() {
		//try to get orders from database
		try {
			List<OrderModel> orders = service.getOrders();
			//if orders arent set to anything return not found
			if (orders == null) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			} else
				//return all orders in json format
				return new ResponseEntity<>(orders, HttpStatus.OK);
		} catch (Exception e) {
			//catch any exception and return internal server error
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * Returns XML format list of orders
	 * 
	 * @return return list
	 */
	@GetMapping(path = "/getxml", produces = { MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<?> getOrdersAsXml() {
		//try to populate OrderList
		try {
			OrderList list = new OrderList();
			list.setOrders(service.getOrders());
			//If list is empty return not found
			if (list.getOrders() == null) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			} else
				// returns all orders in a xml format
				return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			//catch any exception and return internal server error
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
