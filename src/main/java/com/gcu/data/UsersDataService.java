package com.gcu.data;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.exception.DatabaseException;
import com.gcu.model.UserModel;

@Service
public class UsersDataService implements DataAccessInterface<UserModel> {

	@SuppressWarnings("unused")
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public UsersDataService(DataSource dataSource) 
	{
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	@Override
	public boolean create(UserModel user) {
		String sql = "INSERT INTO users( FIRST_NAME, LAST_NAME, ADDRESS, EMAIL, USERNAME, PASSWORD) VALUES (?, ?, ?, ?, ?, ?)";
		try 
		{
			int rows = jdbcTemplateObject.update(sql,
												user.getFirstname(),
												user.getLastname(),
												user.getAddress(),
												user.getEmail(),
												user.getCredentials().getUsername(),
												user.getCredentials().getPassword());
			return rows == 1 ? true : false;
		}
		catch(Exception e){
			throw new DatabaseException("The Database Crashed", e);
		}
	}

	@Override
	public boolean update(UserModel user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(UserModel user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<UserModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
