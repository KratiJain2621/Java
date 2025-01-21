package com.dk.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Student
{
	@SequenceGenerator(name = "studentseq", schema = "guardian22", initialValue = 21)
	
	@Id
	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "studentseq")
	private int sid;
	private String name;
	private int num; //num of books issued
	private String phone, email ,branch ,password;
	
	
	
	public String getPhone()
	{
		return phone;
	}

	public void setPhone(String phone)
	{
		this.phone = phone;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public String getBranch()
	{
		return branch;
	}

	public void setBranch(String branch)
	{
		this.branch = branch;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public Student(int sid, String name, int num, String phone, String email, String branch, String password)
	{
		super();
		this.sid = sid;
		this.name = name;
		this.num = num;
		this.phone = phone;
		this.email = email;
		this.branch = branch;
		this.password = password;
	}

	public Student(int sid, String name)
	{
		super();
		this.sid = sid;
		this.name = name;
	}
	
	public Student(int sid, String name, int num)
	{
		super();
		this.sid = sid;
		this.name = name;
		this.num = num;
	}

	public Student()
	{
		super();
	}
	public int getSid()
	{
		return sid;
	}
	public void setSid(int sid)
	{
		this.sid = sid;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getNum()
	{
		return num;
	}
	public void setNum(int num)
	{
		this.num = num;
	}

	@Override
	public String toString()
	{
		return "Student [sid=" + sid + ", name=" + name + ", num=" + num + ", phone=" + phone + ", email=" + email
				+ ", branch=" + branch + ", password=" + password + "]";
	}
	
}
