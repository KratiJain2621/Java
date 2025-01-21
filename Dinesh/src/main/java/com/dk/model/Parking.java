package com.dk.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Parking
{
	@Id
	private int parkid;
	
	int floor;
	
	//joincolumn = employee_empid
	@JoinColumn(name="empid")
	@OneToOne (fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	Employee employee;

	public Parking(int parkid, int floor, Employee employee)
	{
		super();
		this.parkid = parkid;
		this.floor = floor;
		this.employee = employee;
	}

	public Parking()
	{
		super();
	}

	public int getParkid()
	{
		return parkid;
	}

	public void setParkid(int parkid)
	{
		this.parkid = parkid;
	}

	public int getFloor()
	{
		return floor;
	}

	public void setFloor(int floor)
	{
		this.floor = floor;
	}

	public Employee getEmployee()
	{
		return employee;
	}

	public void setEmployee(Employee employee)
	{
		this.employee = employee;
	}

	@Override
	public String toString()
	{
		return "Parking [parkid=" + parkid + ", floor=" + floor + ", employee=" + employee + "]";
	}
	
	

}
