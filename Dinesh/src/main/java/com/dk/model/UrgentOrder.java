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
//@DiscriminatorValue(value = "urgent")

//@Entity
//@Table (name="urgentorder")
//@AttributeOverrides ({
//		@AttributeOverride(name ="orderid", column = @Column(name="orderid")),
//		@AttributeOverride(name ="location", column = @Column(name="location")),
//		@AttributeOverride(name ="ordertime", column = @Column(name="ordertime"))
//		
//})


@Entity
@Table(name="urgentorder1")
@PrimaryKeyJoinColumn (name = "orderid")
public class UrgentOrder extends HomeOrder
{
	int minutes;

	public UrgentOrder(int orderid, String location, Date ordertime, int minutes)
	{
		super(orderid, location, ordertime);
		this.minutes = minutes;
	}

	public UrgentOrder()
	{
		super();
	}

	public int getMinutes()
	{
		return minutes;
	}

	public void setMinutes(int minutes)
	{
		this.minutes = minutes;
	}

	@Override
	public String toString()
	{
		return "UrgentOrder [minutes=" + minutes + ", getOrderid()=" + getOrderid() + ", getLocation()=" + getLocation()
				+ ", getOrdertime()=" + getOrdertime() + "]";
	}
	
}