package com.dk.service;

import java.util.List;

import com.dk.model.Book;

public interface LibService
{
	public boolean issueBook(int bid, int sid);
	public boolean returnBook(int bid);
	public List<Book> getBooksIssued(int sid);
}
