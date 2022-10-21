package com.gcu.model;

/**
 * Model for orders to be contained in orders list
 * @author Edu and Chael
 */
public class OrderModel2 {
	//creates private variables
	private long id;
	private long productId;
	private String customerName;
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
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * public getter for private variable productName
	 * @return productName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * public setter for private variable productName
	 * @param productName
	 */
	public void setCustomerName(String productName) {
		this.customerName = productName;
	}
	/**
	 * public getter for private variable price
	 * @return price
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
	 * @param productName
	 * @param price
	 * @param quantity
	 */
	public OrderModel2(long id, long productId, String customerName, float total, int quantity) {
		super();
		this.id = id;
		this.productId = productId;
		this.customerName = customerName;
		this.total = total;
		this.quantity = quantity;
	}
	/**
	 * @return the productId
	 */
	public long getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(long productId) {
		this.productId = productId;
	}
	
	
	
	
}
