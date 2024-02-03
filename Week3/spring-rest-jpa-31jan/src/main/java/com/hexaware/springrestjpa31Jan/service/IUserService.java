package com.hexaware.springrestjpa31Jan.service;

import java.util.List;

import com.hexaware.springrestjpa31Jan.entity.User;

public interface IUserService {
    User addUser(User user);
    User updateUser(User user);
    String deleteUser(int uid);
    User getUserById(int uid);
    List<User> getAllUsers();
    
    List<User> getByUserType(String usertype);
    

	int deleteuserByUserName(String userName);

    
}
