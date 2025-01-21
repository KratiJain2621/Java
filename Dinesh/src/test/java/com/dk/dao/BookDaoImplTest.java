package com.dk.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dk.model.Book;

public class BookDaoImplTest
{
	private static final Logger log= Logger.getLogger(BookDaoImplTest.class);
	@BeforeClass
	public static void setUpDb()
	{
		EmfProvider.getEmf();
		EmfProvider.getEm();
	}
	@AfterClass
	public static void tearDown()
	{
		EmfProvider.getEmf().close();
		EmfProvider.getEm().close();
	}
	@Test
	public void testFindAll()
	{
		BookDao bdao = new BookDaoImpl();
		List<Book> list = bdao.findAll();
		list.forEach(log::debug);
		assertTrue(list.size() > 1);
	}
	@Test
	public void testFindById()
	{
		BookDao bdao = new BookDaoImpl();
		Book book = bdao.findById(19);
		assertNotNull(book);
	}
	@Test
	public void testUpdateBook()
	{
		EmfProvider.getEm().getTransaction().begin();
		BookDao bdao = new BookDaoImpl();
		Book book = bdao.findById(19);
		book.setTitle("Two Authors");
		EmfProvider.getEm().getTransaction().commit();
		Book book1 = bdao.findById(19);
		EmfProvider.getEm().refresh(book1);
		assertTrue(book1.getTitle().equals("Two Authors"));
	}	
}
