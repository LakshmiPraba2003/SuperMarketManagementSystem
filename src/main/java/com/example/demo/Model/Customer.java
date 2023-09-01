package com.example.demo.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Entity
@Table(name="Customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = (GenerationType.IDENTITY))
    private int custid;
    private String custname;
    private String custmobile;
    
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn
    private ShoppingCart sc;
	public Customer() {
		super();
	}
	public Customer(int custid, String custname, String custmobile) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.custmobile = custmobile;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getCustmobile() {
		return custmobile;
	}
	public void setCustmobile(String custmobile) {
		this.custmobile = custmobile;
	}
	public ShoppingCart getSc() {
		return sc;
	}
	public void setSc(ShoppingCart sc) {
		this.sc = sc;
	}
    
    
}
