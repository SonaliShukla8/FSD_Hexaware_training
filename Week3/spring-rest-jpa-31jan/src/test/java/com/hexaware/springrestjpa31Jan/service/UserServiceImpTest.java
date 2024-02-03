package com.hexaware.springrestjpa31Jan.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.hexaware.springrestjpa31Jan.entity.User;
@SpringBootTest
class UserServiceImpTest {
    @Autowired
    IUserService service;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testAddUser() {
		User user=new User(12,"Jack","jack67@gmail.com","Jack@09","seller");
		User u1=service.addUser(user);
		assertNotNull(u1);
		assertEquals(12,u1.getUserId());
	}

	@Test
	void testUpdateUser() {
		User user=new User(5,"Raj","raj67@gmail.com","Jack@09","seller");
		User u1=service.updateUser(user);
		assertNotNull(u1);
		assertEquals("seller",u1.getUserType());
	}

	@Test
	void testDeleteUser() {
		int id=11;
		String s=service.deleteUser(11);
		assertNotNull(s);
	}

	@Test
	void testGetUserById() {
		int userId=9;
		User user=service.getUserById(userId);
		assertNotNull(user);
		assertEquals("customer",user.getUserType());
		
	}

	@Test
	void testGetAllUsers() {
		List<User> list1=service.getAllUsers();
		assertNotNull(list1);
	
	}

}
