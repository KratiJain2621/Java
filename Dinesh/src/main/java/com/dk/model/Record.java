package com.dk.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;

@Entity
public class Record
{
 	@TableGenerator(name = "recordgen", initialValue = 7)
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "recordgen")
	private int recid;
	private int bid;
	private int sid;
	private Date isDate;
	private Date retDate;
	private int fine;
	public Record(int recid , int bid, int sid, Date isDate, Date redDate, int fine)
	{
		super();
		this.recid = recid;
		this.bid = bid;
		this.sid = sid;
		this.isDate = isDate;
		this.retDate = redDate;
		this.fine = fine;
	}
	
	public Record(int bid, int sid, Date isDate)
	{
		super();
		this.bid = bid;
		this.sid = sid;
		this.isDate = isDate;
	}

	public Record()
	{
		super();
	}
	public int getRecid()
	{
		return recid;
	}
	public void setRecid(int recid)
	{
		this.recid = recid;
	}
	public int getBid()
	{
		return bid;
	}
	public void setBid(int bid)
	{
		this.bid = bid;
	}
	public int getSid()
	{
		return sid;
	}
	public void setSid(int sid)
	{
		this.sid = sid;
	}
	public Date getIsDate()
	{
		return isDate;
	}
	public void setIsDate(Date isDate)
	{
		this.isDate = isDate;
	}
	public Date getRetDate()
	{
		return retDate;
	}
	public void setRetDate(Date redDate)
	{
		this.retDate = redDate;
	}
	public int getFine()
	{
		return fine;
	}
	public void setFine(int fine)
	{
		this.fine = fine;
	}
	@Override
	public String toString()
	{
		return "Record [recid=" + recid + ", bid=" + bid + ", sid=" + sid + ", isDate=" + isDate + ", redDate="
				+ retDate + ", fine=" + fine + "]";
	}
	

}
