package com.hexaware.springrestjpa31Jan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrestjpa31Jan.entity.User;
import com.hexaware.springrestjpa31Jan.repository.UserRepository;

import jakarta.transaction.Transactional;
@Transactional
@Service
public class UserServiceImp implements IUserService {
    @Autowired
    UserRepository repo;
	
    @Override
	public User addUser(User user) {
		
		return repo.save(user);
	}

	@Override
	public User updateUser(User user) {
		
		return repo.save(user);
	}

	@Override
	public String deleteUser(int uid) {
		repo.deleteById(uid);
		return "record deleted";
	}

	@Override
	public User getUserById(int uid) {
		return repo.findById(uid).orElse(null);
	}

	@Override
	public List<User> getAllUsers() {
		
		return repo.findAll();
	}

	@Override
	public List<User> getByUserType(String usertype) {
		return repo.findByUserType(usertype);
	}

	@Override
	public int deleteuserByUserName(String userName) {
		
		return repo.deleteByUserName(userName);
	}
	
	

}
