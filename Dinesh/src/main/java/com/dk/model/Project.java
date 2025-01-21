package com.dk.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Project
{
	@Id
	private int pid;
	
	private String ptitle;
	
	@ManyToMany (fetch = FetchType.EAGER, targetEntity = Employee.class)
	@JoinTable (name =  "workson", 
		joinColumns = { @JoinColumn(name="pid")}, 
		inverseJoinColumns = {@JoinColumn(name="empid")}  )
	List<Employee> employees = new ArrayList<>();

	public Project(int pid, String ptitle, List<Employee> employees)
	{
		super();
		this.pid = pid;
		this.ptitle = ptitle;
		this.employees = employees;
	}

	public Project()
	{
		super();
	}

	public int getPid()
	{
		return pid;
	}

	public void setPid(int pid)
	{
		this.pid = pid;
	}

	public String getPtitle()
	{
		return ptitle;
	}

	public void setPtitle(String ptitle)
	{
		this.ptitle = ptitle;
	}

	public List<Employee> getEmployees()
	{
		return employees;
	}

	public void setEmployees(List<Employee> employees)
	{
		this.employees = employees;
	}

	@Override
	public String toString()
	{
		return "Project [pid=" + pid + ", ptitle=" + ptitle + ", employees=" + employees + "]";
	}
	
	
	

}
