package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import com.exception.DatabaseException;

import com.gcu.model.OrderModel;

@Service
public class OrdersDataService implements DataAccessInterface<OrderModel> {
	
	@SuppressWarnings("unused")
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public OrdersDataService(DataSource dataSource) 
	{
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public List<OrderModel> findAll() {
		String sql = "SELECT * FROM ORDERS";
		List<OrderModel> orders = new ArrayList<OrderModel>();
		try 
		{
			SqlRowSet srs = jdbcTemplateObject.queryForRowSet(sql);
			while(srs.next()) 
			{
				orders.add(new OrderModel(srs.getLong("ID"),
										srs.getLong("PRODUCT_ID"),
										srs.getString("CUSTOMER_NAME"),
										srs.getFloat("TOTAL"),
										srs.getInt("QUANTITY")));
			}
		}
		catch(Exception e)
		{
			throw new DatabaseException("The Database Crashed", e);
		}
		return orders;
	}

	@Override
	public OrderModel findById(long id) {
		return null;
	}

	@Override
	public boolean create(OrderModel order) {
		String sql = "INSERT INTO ORDERS(ORDER_NO, PRODUCT_NAME, PRICE, QUANTITY) VALUES (?, ?, ?, ?))";
		try 
		{
			int rows = jdbcTemplateObject.update(sql,
												order.getProductId(),
												order.getCustomerName(),
												order.getTotal(),
												order.getQuantity());
			return rows == 1 ? true : false;
		}
		catch(Exception e)
		{
			throw new DatabaseException("The Database Crashed", e);
		}
	}

	@Override
	public boolean update(OrderModel order) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean delete(OrderModel order) {
		// TODO Auto-generated method stub
		return true;
	}
	
}
