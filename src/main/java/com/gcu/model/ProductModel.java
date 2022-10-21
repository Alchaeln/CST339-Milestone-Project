package com.gcu.model;

/**
 * Model for products to be sold
 * @author Edu and Chael
 */
public class ProductModel {
	//creates private variables
	private long id;
	private String productName;
	private float price;
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
}
