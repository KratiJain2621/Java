package com.dk.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import com.dk.model.Book;

public class BookDaoImpl implements BookDao
{
	private static Logger log = Logger.getLogger(BookDaoImpl.class);
	
	EntityManager em = EmfProvider.getEm();
	@Override
	public Book findById(int bid)
	{
		log.debug("finding book with id " + bid);
		return em.find(Book.class, bid);
	}
	@Override
	public Book updateBook(Book book)
	{
		log.debug("updating book with bid " + book.getBid());
		try
		{
		em.persist(book);
		return book;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Book addBook(Book book)
	{
		log.debug("Adding new book with details " + book);
		try
		{
		em.persist(book);
		return book;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean removeBook(Book book)
	{
		Book bookIndb = em.find(Book.class,book.getBid());
		if(bookIndb != null)
		{
			em.remove(bookIndb);
			return true;
		}
		return false;
	}

	@Override
	public List<Book> findAll()
	{
		//can not write SQL 
		//JPAQL : Java Persistence API Query Language as Sql
		//HQL : Hibernate Query Language
		Query query = em.createQuery("select b from Book b");
		List<Book> list = query.getResultList();
		//put all in the list of Book
		return list;
	}

}
