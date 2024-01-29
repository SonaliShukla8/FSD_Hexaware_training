package com.hexaware.spring_Jan23.service;

import java.util.List;

import com.hexaware.spring_Jan23.bean.Users;

public interface IUserService {
	public boolean  createUser(Users user);
	public boolean   updateUser(Users user);
	
	public boolean  deleteUserById(int userId);
	
	public Users  selectUserById(int userId);
	
	public  List<Users>  selectAllUsers();
}
