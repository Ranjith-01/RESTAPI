package com.skcet.com.model;

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
	private int ordernumber;
	private String customer;
	private String addressofcustomer;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="foreignkey",referencedColumnName = "ordernumber")
	private List<gardenmodel> selledvegetable;
	public int getOrdernumber() {
		return ordernumber;
	}
	public void setOrdernumber(int ordernumber) {
		this.ordernumber = ordernumber;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getAddressofcustomer() {
		return addressofcustomer;
	}
	public void setAddressofcustomer(String addressofcustomer) {
		this.addressofcustomer = addressofcustomer;
	}
	public List<gardenmodel> getSelledvegetable() {
		return selledvegetable;
	}
	public void setSelledvegetable(List<gardenmodel> selledvegetable) {
		this.selledvegetable = selledvegetable;
	}
	

}
