package com.dk.model;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


//@Entity
//@Table(name = "allorders")
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "ordertype", discriminatorType = DiscriminatorType.STRING)
//@DiscriminatorValue(value = "homeorder")

//@Entity
//@Table (name="homeorder")
//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

@Entity
@Table (name="homeorder")
@Inheritance(strategy = InheritanceType.JOINED)
public class HomeOrder
{
	@Id
	private int orderid;
	private String location;
	private Date ordertime;
	public HomeOrder(int orderid, String location, Date ordertime)
	{
		super();
		this.orderid = orderid;
		this.location = location;
		this.ordertime = ordertime;
	}
	public HomeOrder()
	{
		super();
	}
	public int getOrderid()
	{
		return orderid;
	}
	public void setOrderid(int orderid)
	{
		this.orderid = orderid;
	}
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String location)
	{
		this.location = location;
	}
	public Date getOrdertime()
	{
		return ordertime;
	}
	public void setOrdertime(Date ordertime)
	{
		this.ordertime = ordertime;
	}
	@Override
	public String toString()
	{
		return "HomeOrder [orderid=" + orderid + ", location=" + location + ", ordertime=" + ordertime + "]";
	}
	
}



