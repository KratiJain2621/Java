package com.dk.model;

public class Librarian
{
	private int librid;
	private String name;
	private String password;
	
	public Librarian()
	{
		super();
	}
	public Librarian(int librid, String name, String password)
	{
		super();
		this.librid = librid;
		this.name = name;
		this.password = password;
	}
	public int getLibrid()
	{
		return librid;
	}
	public void setLibrid(int librid)
	{
		this.librid = librid;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	@Override
	public String toString()
	{
		return "Librarian [librid=" + librid + ", name=" + name + ", password=" + password + "]";
	}
	

}
