package com.skcet.day6.model;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class orderdata {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String orderid;
	private String username;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="orderdatas",referencedColumnName = "id")
	private List<Users> vegetableofordered;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public List<Users> getVegetableofordered() {
		return vegetableofordered;
	}
	public void setVegetableofordered(List<Users> vegetableofordered) {
		this.vegetableofordered = vegetableofordered;
	}
	

}
