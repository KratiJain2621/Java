package com.dk.model;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
//@Entity
//@Table (name="allorders")
//@DiscriminatorValue(value = "regular")

//@Entity
//@Table (name="regularorder")
//@AttributeOverrides ({
//		@AttributeOverride(name ="orderid", column = @Column(name="orderid")),
//		@AttributeOverride(name ="location", column = @Column(name="location")),
//		@AttributeOverride(name ="ordertime", column = @Column(name="ordertime"))
//		
//})

@Entity
@Table(name="regularorder1")
@PrimaryKeyJoinColumn (name = "orderid")
public class RegularOrder extends HomeOrder
{
	int hours;

	public RegularOrder(int orderid, String location, Date ordertime, int hours)
	{
		super(orderid, location, ordertime);
		this.hours = hours;
	}

	public RegularOrder()
	{
		super();
	}

	public int getHours()
	{
		return hours;
	}

	public void setHours(int hours)
	{
		this.hours = hours;
	}

	@Override
	public String toString()
	{
		return "RegularOrder [hours=" + hours + ", getOrderid()=" + getOrderid() + ", getLocation()=" + getLocation()
				+ ", getOrdertime()=" + getOrdertime() + "]";
	}
	
}