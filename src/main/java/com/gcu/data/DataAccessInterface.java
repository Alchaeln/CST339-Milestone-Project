package com.gcu.data;

import java.util.List;

import com.gcu.model.ProductModel;

public interface DataAccessInterface <T> {
	public List<T> findAll();
	public T findById(long id);
	public boolean create(T t);
	public boolean update(T t);
	public boolean delete(T t);
}
