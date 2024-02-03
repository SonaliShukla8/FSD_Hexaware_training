package com.hexaware.springrestjpa31Jan.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.hexaware.springrestjpa31Jan.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
	List<User> findByUserType(String usertype);
	
     @Modifying
	@Query("delete from User u where u.userName=?1")
	int deleteByUserName(String userName);
     
   
     
}
