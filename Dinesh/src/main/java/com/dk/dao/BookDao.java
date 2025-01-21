package com.dk.dao;

import java.util.List;

import com.dk.model.Book;

public interface BookDao
{
	Book findById(int bid);
	Book updateBook(Book book);
	Book addBook(Book book);
	boolean removeBook(Book book);
	List<Book> findAll(); //orgranize import control + shift + O , control 1

}
