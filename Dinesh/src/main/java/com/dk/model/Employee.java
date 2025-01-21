package com.dk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee
{
	@Id
	private int empid;
	
	@Column(name="name")
	private String name;
	
	// Hibernate will assume column for join = department_depid 
	// if not given joincolumn
	@ManyToOne (fetch = FetchType.EAGER)
	@JoinColumn(name="depid")
	private Department department; //refers to one complete department

	public Employee(int empid, String name, Department department)
	{
		super();
		this.empid = empid;
		this.name = name;
		this.department = department;
	}

	public Employee()
	{
		super();
	}

	public int getEmpid()
	{
		return empid;
	}

	public void setEmpid(int empid)
	{
		this.empid = empid;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Department getDepartment()
	{
		return department;
	}

	public void setDepartment(Department department)
	{
		this.department = department;
	}

	@Override
	public String toString()
	{
		return "Employee [empid=" + empid + ", name=" + name + ", department=" + department + "]";
	}
	
	

}
