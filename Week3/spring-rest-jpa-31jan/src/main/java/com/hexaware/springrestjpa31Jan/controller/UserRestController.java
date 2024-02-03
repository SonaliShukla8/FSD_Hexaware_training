package com.hexaware.springrestjpa31Jan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hexaware.springrestjpa31Jan.entity.User;
import com.hexaware.springrestjpa31Jan.service.IUserService;

import jakarta.validation.Valid;
@RestController
@RequestMapping("api/user")
public class UserRestController {
	@Autowired
	IUserService service;
	
	@PostMapping("/add")
	public User addUser(@RequestBody User user) {
		return service.addUser(user);
	}
	
	@PutMapping("/update")
	public User upDateUser(@RequestBody @Valid User user) {
		return service.updateUser(user);
	}
	
	
	@GetMapping("/get/{uid}")
	public User getUserById(@PathVariable int uid) {
		return service.getUserById(uid);
	}
	
	@GetMapping("/getall")
	public List<User> getAll(){
		return service.getAllUsers();
	}
	
	@DeleteMapping("/delete/{uid}")
	public String deleteEmployeeById(@PathVariable int uid) {
		return service.deleteUser(uid);
	}
	
	@GetMapping("/getbyusertype/{usertype}")
	public List<User> getUserbyUserType(@PathVariable String usertype){
		return service.getByUserType(usertype);
		
	}
	
	@DeleteMapping("/deletebyusername/{username}")
	public String deletebyusername(@PathVariable String username) {
		int count =service.deleteuserByUserName(username);
		return count + "records deleted";
	}

}
