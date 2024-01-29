package com.hexaware.spring_Jan23.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.spring_Jan23.bean.Users;

public class UserMapper implements RowMapper<Users>{

	@Override
	public Users mapRow(ResultSet rs, int rowNum) throws SQLException {
		Users user = new Users();

		user.setUserId(rs.getInt("User_ID"));
		user.setUserName(rs.getString("Username"));
		user.setEmail(rs.getString("Email"));
		user.setPassword(rs.getString("Password"));
		user.setUserType(rs.getString("UserType"));
		
		return user;
	}

}
