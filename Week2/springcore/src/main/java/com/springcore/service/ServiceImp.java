package com.springcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcore.dao.IDao;

@Service
public class ServiceImp implements IService {
	
	
	
	@Autowired
	IDao dao;
     @Override
	public void getService() {
		System.out.println("Service Ececution");
		System.out.println(" serivce got DAO obj "+dao);
		dao.getDao();

	}

}
