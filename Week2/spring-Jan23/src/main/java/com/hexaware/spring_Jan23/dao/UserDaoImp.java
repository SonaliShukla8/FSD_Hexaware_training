package com.hexaware.spring_Jan23.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.spring_Jan23.bean.Users;
@Repository
public class UserDaoImp implements IUserDao {

	JdbcTemplate jdbcTemplate;

	@Autowired
	public UserDaoImp(DataSource datasource) {

		jdbcTemplate = new JdbcTemplate(datasource);

		System.out.println(jdbcTemplate);

	}  
	
	@Override
	public boolean createUser(Users user) {
		String insertQuery = "insert into users values(?,?,?,?,?)";

		int count = jdbcTemplate.update(insertQuery,user.getUserId(),user.getUserName(), user.getEmail(), user.getPassword(), user.getUserType());

		return count > 0;
		
	}

	@Override
	public boolean updateUser(Users user) {
		String updateQuery = "update users set Username = ? , Email=?, Password = ?, UserType=? where User_ID = ?";

		int count = jdbcTemplate.update(updateQuery,user.getUserName(), user.getEmail(),user.getPassword(),user.getUserType(),user.getUserId());
				

		return count > 0;
		
	}

	@Override
	public boolean deleteUserById(int userId) {
		String deleteQuery = "delete from users  where User_ID = ?";

		int count = jdbcTemplate.update(deleteQuery, userId);

		return count > 0;
	}

	@Override
	public Users selectUserById(int userId) {
		String selectQueryById = "select User_ID ,Username ,Email,Password ,UserType  from users where User_ID = ?";

		Users user = jdbcTemplate.queryForObject(selectQueryById, new UserMapper(), userId);

		return user;
		
	}

	@Override
	public List<Users> selectAllUsers() {
		String selectQuery = "select User_ID ,Username ,Email,Password ,UserType  from users";

		List<Users> list = jdbcTemplate.query(selectQuery, new UserMapper());

		return list;
	}

}
