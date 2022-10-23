package com.gcu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Model for products to be sold
 * @author Edu and Chael
 */
public class ProductModel {
	//creates private variables
	@NotNull(message="Username is a required field")
	@Size(min=1, max=32, message="Username must be between 1 and 32 characters")
	private long id;
	@NotNull(message="Username is a required field")
	@Size(min=1, max=32, message="Username must be between 1 and 32 characters")
	private String productName;
	@NotNull(message="Username is a required field")
	@Size(min=1, max=32, message="Username must be between 1 and 32 characters")
	private float price;
	@NotNull(message="Username is a required field")
	@Size(min=1, max=32, message="Username must be between 1 and 32 characters")
	private int quantity;
	
	/**
	 * public getter for private variable id
	 * @return id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * public setter for private variable id
	 * @param id
	 */
	public void setId(Long id) {
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
	public Float getPrice() {
		return price;
	}
	/**
	 * public setter for private variable price
	 * @param price
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * public getter for private variable quantity
	 * @return quantity
	 */
	public Integer getQuantity() {
		return quantity;
	}
	/**
	 * public setter for private variable quantity
	 * @param quantity
	 */
	public void setQuantity(Integer quantity) {
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
