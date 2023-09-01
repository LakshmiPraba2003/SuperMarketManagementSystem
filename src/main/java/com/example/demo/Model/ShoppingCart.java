package com.example.demo.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="ShoppingCart")
public class ShoppingCart {
	@Id
    private int cartid;
    private float cartprice;
    
    @OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="fkid",referencedColumnName = "cartid")
    private List<Orders> order;
	public ShoppingCart() {
		super();
	}
	public ShoppingCart(int cartid, float cartprice) {
		super();
		this.cartid = cartid;
		this.cartprice = cartprice;
	}
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public float getCartprice() {
		return cartprice;
	}
	public void setCartprice(float cartprice) {
		this.cartprice = cartprice;
	}
	public List<Orders> getOrder() {
		return order;
	}
	public void setOrder(List<Orders> order) {
		this.order = order;
	}
    
}
