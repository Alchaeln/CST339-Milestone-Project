package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Model for products to be sold
 * @author Edu and Chael
 */
public class ProductModel {
	//creates private variables
	@NotNull(message="ID is a required field")
	@Size(min=1, max=4, message="ID must be between 1 and 4 characters")
	private long id;
	
	@NotNull(message="Product Name is a required field")
	@Size(min=1, max=32, message="Product Name must be between 1 and 32 characters")
	private String productName;
	
	@NotNull(message="Price is a required field")
	@Size(min=1, max=16, message="Price must be between 1 and 16 characters")
	private float price;
	
	@NotNull(message="Quantity is a required field")
	@Size(min=1, max=8, message="Quantity must be between 1 and 8 characters")
	private int quantity;
	
	/**
	 * public getter for private variable id
	 * @return id
	 */
	public long getId() {
		return id;
	}
	/**
	 * public setter for private variable id
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * public getter for private variable productName
	 * @return productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * public setter for private variable productName
	 * @param productName
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * public getter for private variable price
	 * @return price
	 */
	public float getPrice() {
		return price;
	}
	/**
	 * public setter for private variable price
	 * @param price
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	/**
	 * public getter for private variable quantity
	 * @return quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	/**
	 * public setter for private variable quantity
	 * @param quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public ProductModel(long id, String productName, float price, int quantity) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
}
