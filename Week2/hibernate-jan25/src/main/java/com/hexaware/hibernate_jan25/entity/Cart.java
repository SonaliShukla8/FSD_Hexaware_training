package com.hexaware.hibernate_jan25.entity;

import java.util.HashSet;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Cart {
	@Id
	private int cartId;
	private String cartName;
	@ManyToMany(mappedBy="carts" , fetch = FetchType.LAZY)
	private Set<Item> items= new HashSet<Item>();
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(int cartId, String cartName, Set<Item> items) {
		super();
		this.cartId = cartId;
		this.cartName = cartName;
		this.items = items;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public String getCartName() {
		return cartName;
	}

	public void setCartName(String cartName) {
		this.cartName = cartName;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}
	
	
	

}
