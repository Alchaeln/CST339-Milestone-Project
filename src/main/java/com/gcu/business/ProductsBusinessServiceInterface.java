package com.gcu.business;

import java.util.List;

import com.gcu.model.ProductModel;

public interface ProductsBusinessServiceInterface {
	
	/**
	 * returns hard coded list of products
	 * @return products
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
