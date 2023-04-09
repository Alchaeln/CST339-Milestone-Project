package com.gcu.model;

/**
 * Model for orders to be contained in orders list
 * @author Edu and Chael
 */
public class OrderModel {
	//creates private variables
	private long id;
	private long productId;
	private long userId;
	private float total;
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
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * getter for userId
	 * @return userId
	 */
	public long getUserId() {
		return userId;
	}
	/**
	 * setter for userId
	 * @param userId
	 */
	public void setUserId(long userId) {
		this.userId = userId;
	}
	/**
	 * getter for total
	 * @return total
	 */
	public Float getTotal() {
		return total;
	}
	/**
	 * public setter for private variable price
	 * @param price
	 */
	public void setTotal(Float price) {
		this.total = price;
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
	 * @param productId
	 * @param userId
	 * @param total
	 * @param quantity
	 */
	public OrderModel(long id, long productId, long userId, float total, int quantity) {
		super();
		this.id = id;
		this.productId = productId;
		this.userId = userId;
		this.total = total;
		this.quantity = quantity;
	}
	/**
	 * gets product ID
	 * @return productId
	 */
	public long getProductId() {
		return productId;
	}
	/**
	 * sets product ID
	 * @param productId
	 */
	public void setProductId(long productId) {
		this.productId = productId;
	}
	
	
	
	
}
