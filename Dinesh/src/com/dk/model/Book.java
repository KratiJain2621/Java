package com.dk.model;

public class Book
{
	public  int bid;
	public String title;
	public String author;
	public int recid;
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
