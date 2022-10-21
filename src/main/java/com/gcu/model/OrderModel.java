package com.gcu.model;

/**
 * Model for orders to be contained in orders list
 * @author Edu and Chael
 */
public class OrderModel {
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
	/**
	 * public constructor
	 * @param id
	 * @param productName
	 * @param price
	 * @param quantity
	 */
	public OrderModel(long id, String productName, float price, int quantity) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	
	
}
