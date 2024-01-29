package com.hexaware.hibernate_jan25.entity;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;




@Entity
public class Item {
	@Id
    private int itemId;
    private String itemName;
    private int quantityAvailable;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name="cart_items_table" , joinColumns= {@JoinColumn(name="cartId")},
	inverseJoinColumns= {@JoinColumn(name="itemId")})
    private Set<Cart> carts= new HashSet<Cart>();
	
    public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(int itemId, String itemName, int quantityAvailable, Set<Cart> carts) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantityAvailable = quantityAvailable;
		this.carts = carts;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}

	public Set<Cart> getCarts() {
		return carts;
	}

	public void setCarts(Set<Cart> carts) {
		this.carts = carts;
	}
	public void addCart(Cart cart) {
		this.getCarts().add(cart);
		
	}
	
    
    
}
