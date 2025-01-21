package com.dk.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department
{
	@Id
	@Column(name="depid")
	private int depid;
	
	private String name;
	
	@OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
	List<Employee> employees = new ArrayList<>();

	public Department(int depid, String name)
	{
		super();
		this.depid = depid;
		this.name = name;
	}

	public Department()
	{
		super();
	}

	public int getDepid()
	{
		return depid;
	}

	public void setDepid(int depid)
	{
		this.depid = depid;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		return "Department [depid=" + depid + ", name=" + name + "]";
	}
	

}
