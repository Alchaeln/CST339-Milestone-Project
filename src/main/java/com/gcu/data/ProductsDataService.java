package com.gcu.data;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

import com.exception.DatabaseException;
import com.gcu.model.ProductModel;

@Service
public class ProductsDataService implements DataAccessInterface<ProductModel> {

	@SuppressWarnings("unused")
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	public ProductsDataService(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public List<ProductModel> findAll() {
		String sql = "SELECT * FROM PRODUCTS";
		List<ProductModel> products = new ArrayList<ProductModel>();
		try {
			SqlRowSet srs = jdbcTemplateObject.queryForRowSet(sql);
			while (srs.next()) {
				products.add(new ProductModel(srs.getLong("ID"), srs.getString("PRODUCT_NAME"), srs.getFloat("PRICE"),
						srs.getInt("QUANTITY")));
			}
		} catch (Exception e) {
			throw new DatabaseException("The Database Crashed", e);
		}
		return products;
	}

	@Override
	public boolean create(ProductModel product) {
		String sql = "INSERT INTO products( PRODUCT_NAME, PRICE, QUANTITY) VALUES (?, ?, ?)";
		try {
			int rows = jdbcTemplateObject.update(sql, product.getProductName(), product.getPrice(),
					product.getQuantity());
			return rows == 1 ? true : false;
		} catch (Exception e) {
			throw new DatabaseException("The Database Crashed", e);
		}
	}

	@Override
	public boolean update(ProductModel product) {
		String sql = "UPDATE products SET PRODUCT_NAME = '" + product.getProductName() + "', PRICE = "
				+ product.getPrice() + ", QUANTITY = " + product.getQuantity() + " WHERE ID = " + product.getId();
		try {

			int rows = jdbcTemplateObject.update(sql);
			
			return rows == 1 ? true : false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(ProductModel product) {
		String sql = "DELETE FROM products WHERE ID = " + product.getId();
		try {

			int rows = jdbcTemplateObject.update(sql);
			
			return rows == 1 ? true : false;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public ProductModel findById(int id) {
		return null;
	}
}
