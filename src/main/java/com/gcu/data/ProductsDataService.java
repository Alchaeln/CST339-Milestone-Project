package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import com.gcu.model.ProductModel;

@Service
public class ProductsDataService implements DataAccessInterface<ProductModel> {
	
	@SuppressWarnings("unused")
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public ProductsDataService(DataSource dataSource) 
	{
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public List<ProductModel> findAll() {
		String sql = "SELECT * FROM PRODUCTS";
		List<ProductModel> products = new ArrayList<ProductModel>();
		try 
		{
			SqlRowSet srs = jdbcTemplateObject.queryForRowSet(sql);
			while(srs.next()) 
			{
				products.add(new ProductModel(srs.getLong("ID"),
										srs.getString("PRODUCT_NAME"),
										srs.getFloat("PRICE"),
										srs.getInt("QUANTITY")));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return products;
	}

	@Override
	public ProductModel findById(int id) {
		return null;
	}

	@Override
	public boolean create(ProductModel product) {
		String sql = "INSERT INTO ORDERS(ORDER_NO, PRODUCT_NAME, PRICE, QUANTITY) VALUES (?, ?, ?, ?))";
		try 
		{
			int rows = jdbcTemplateObject.update(sql,
												product.getId(),
												product.getProductName(),
												product.getPrice(),
												product.getQuantity());
			return rows == 1 ? true : false;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public boolean update(ProductModel product) {
		return true;
	}

	@Override
	public boolean delete(ProductModel product) {
		return true;
	}

}
