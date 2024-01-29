package com.springcore.entities;

import org.springframework.stereotype.Component;

@Component
public class Address {
       private String city;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
       
}
