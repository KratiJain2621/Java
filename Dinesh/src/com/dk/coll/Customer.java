package com.dk.coll;

import java.util.Arrays;

public class Customer {
	
	private int custid;
	private String name;
	private String address;
	
	
	public Customer(int custid, String name, String address)
	{
		super();
		this.custid = custid;
		this.name = name;
		this.address = address;
	}
	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
	}
	public Customer(String name) {
		this.name = name;
	}
	public int getCustid() {
		return custid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", name=" + name + ", address=" + address + "]";
	}

	
}
