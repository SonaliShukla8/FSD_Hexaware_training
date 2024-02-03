package com.hexaware.springrestjpa31Jan.controller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexaware.springrestjpa31Jan.entity.User;
@SpringBootTest
class UserRestControllerTest {
	@Autowired
    RestTemplate restTemplate;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testAddUser() {
		User user=new User(15,"Shamim","shalenl23@gmail.com","Shammll12","customer");
		ResponseEntity<User> response=restTemplate.postForEntity("http://localhost:8080/api/user/add", user , User.class);
		User user1=response.getBody();
		assertNotNull(user1);
		assertEquals(15,user1.getUserId());
		assertEquals("customer",user1.getUserType());
	}

	@Test
	void testUpDateUser() {
		int upd=3;
		User user=new User(3,"Shaleen Jha","shalenl23@gmail.com","Shall12","seller");
		 restTemplate.put("http://localhost:8080/api/user/update/"+upd,user ,User.class);
	 
	}

	@Test
	void testGetUserById() {
		int uId=3;
		ResponseEntity<User> response=restTemplate.getForEntity("http://localhost:8080/api/user/get/"+uId,User.class);
	    User user=response.getBody();
	    assertNotNull(user);
	    assertEquals(3,user.getUserId());
	
	}

	@Test
	void testGetAll() {
		ResponseEntity<List> response=restTemplate.getForEntity("http://localhost:8080/api/user/getall", List.class);
	     List<User> list=response.getBody();
	     assertNotNull(list);
	
	
	}

	@Test
	void testDeleteEmployeeById() {
		
	}

}
