package com.dk.service;

import java.util.List;

import com.dk.model.Book;

public interface BookService
{
	Book findById(int bid);
	List<Book> findAll(); //orgranize import control + shift + O , control 1

	Book updateBook(int bid, int recid); //will be called Librarian
	Book updateBook(Book book);
	
	//will be called by Chief Librarian
	Book addBook(int bid, String title, String author, int recid); 
	//will be called by Chief Librarian
	boolean removeBook(int bid); 

}
