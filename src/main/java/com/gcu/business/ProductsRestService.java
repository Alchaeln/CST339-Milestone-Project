package com.gcu.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcu.model.ProductModel;

/**
 * OrdersRestService allows the return of JSON and XML formatted Products list
 * 
 * @author Edu and Chael
 */
@RestController
@RequestMapping("/service")
public class ProductsRestService {

	// initialize service variable
	@Autowired
	private ProductsBusinessServiceInterface service;

	/**
	 * Returns JSON version of Products
	 * 
	 * @return service.getProducts()
	 */
	@GetMapping(path = "/products", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> getProducts() {
		// try to get products from database
		try {
			List<ProductModel> products = service.getProducts();
			// if no products were returned return not found
			if (products == null) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			} else
				// return all products in json format
				return new ResponseEntity<>(products, HttpStatus.OK);
		} catch (Exception e) {
			// catch any exceptions and return internal server error
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	/**
	 * Returns JSON version of a specific Product
	 * @param id
	 * @return service.getProducts()
	 */
	@GetMapping(path = "/product", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<?> getProduct(long id) {
		//try to get a specific order by Id
		try {
			ProductModel product = service.getProduct(id);
			//if no product is returned return not found
			if (product == null) {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			} else
				//return specified product in json format
				return new ResponseEntity<>(product, HttpStatus.OK);
		} catch (Exception e) {
			//catch any exceptions and return internal server error
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
