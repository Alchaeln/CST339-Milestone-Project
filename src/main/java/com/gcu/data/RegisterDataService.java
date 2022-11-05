package com.gcu.data;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.gcu.model.RegisterModel;

@Service
public class RegisterDataService implements DataAccessInterface<RegisterModel> {

	@SuppressWarnings("unused")
	@Autowired
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public RegisterDataService(DataSource dataSource) 
	{
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	@Override
	public boolean create(RegisterModel user) {
		String sql = "INSERT INTO users( FIRST_NAME, LAST_NAME, USERNAME, PHONE_NUMBER, PASSWORD, EMAIL) VALUES (?, ?, ?, ?, ?, ?)";
		try 
		{
			int rows = jdbcTemplateObject.update(sql,
												user.getFirstname(),
												user.getLastname(),
												user.getUsername(),
												user.getPhonenumber(),
												user.getPassword(),
												user.getEmail());
			return rows == 1 ? true : false;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(RegisterModel t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(RegisterModel t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<RegisterModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RegisterModel findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
