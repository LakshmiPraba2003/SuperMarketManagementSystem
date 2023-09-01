package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="orders")
public class Orders {
	@Id
	@GeneratedValue(strategy = (GenerationType.IDENTITY))
    private int orderid;
    private int pdtid;
    private String pdtname;
    
	public Orders() {
		super();
	}
	public Orders(int orderid, int pdtid, String pdtname) {
		super();
		this.orderid = orderid;
		this.pdtid = pdtid;
		this.pdtname = pdtname;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getPdtid() {
		return pdtid;
	}
	public void setPdtid(int pdtid) {
		this.pdtid = pdtid;
	}
	public String getPdtname() {
		return pdtname;
	}
	public void setPdtname(String pdtname) {
		this.pdtname = pdtname;
	}
	
    
}
