package com.dk.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.TableGenerator;

@Entity
public class Book
{
	//Do not write any thing : user will give the new id
	//generate value for me : hibernate wil generate value for you
	// with the help of database only
	//@GeneratedValue (strategy = GenerationType.AUTO)
//	@GeneratedValue (strategy = GenerationType.SEQUENCE) hibernate_sequence
//	@GeneratedValue (strategy = GenerationType.TABLE)	hibernate_sequences col default
//	@GeneratedValue (strategy = GenerationType.IDENTITY) Auto_Increment

//	@TableGenerator(name = "recordgen", initialValue = 7)
//	@Id
//	@GeneratedValue(strategy = GenerationType.TABLE, generator = "recordgen")
	
//	@SequenceGenerator(name = "studentseq", schema = "guardian22", initialValue = 21)
//	@Id
//	@GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "studentseq")
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private  int bid;
	
	private String title;
	private String author;
	private int recid;
	
	private int edition=0;
	
	public Book(int bid, String title, String author)
	{
		super();
		this.bid = bid;
		this.title = title;	
		this.author = author;
	}
	
	public Book(int bid, String title, String author, int recid)
	{
		super();
		this.bid = bid;
		this.title = title;
		this.author = author;
		this.recid = recid;
	}

	public Book()
	{
		super();
	}
	public int getBid()
	{
		return bid;
	}
	public void setBid(int bid)
	{
		this.bid = bid;
	}
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public int getRecid()
	{
		return recid;
	}
	public void setRecid(int recid)
	{
		this.recid = recid;
	}
	@Override
	public String toString()
	{
		return "Book [bid=" + bid + ", title=" + title + ", author=" + author + ", recid=" + recid + "]";
	}
	
	

}
