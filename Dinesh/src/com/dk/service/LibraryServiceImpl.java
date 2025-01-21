package com.dk.service;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Collection;

import com.dk.dao.BookDaoImpl;
import com.dk.dao.RecordDaoImpl;
import com.dk.dao.StudentDaoImpl;
import com.dk.jdbc.DbConnection;
import com.dk.model.Book;
import com.dk.model.Record;
import com.dk.model.Student;


public class LibraryServiceImpl
{
	BookDaoImpl bookDao = new BookDaoImpl();
	StudentDaoImpl studentDao = new StudentDaoImpl();
	RecordDaoImpl recordDao  = new RecordDaoImpl();

	public void issueBook(int bid, int sid)
	{
		try
		{
			DbConnection.getConnection().setAutoCommit(false);

			Book bookObj = bookDao.findById(bid);
			Student studentObj =studentDao.findById(sid);
			Record recObj = new Record();
			recordDao.addRecord(recObj);
			bookObj.recid = recObj.recid;
			studentObj.num++;
			recObj.sid = sid;
			recObj.bid = bid;
			recObj.isDate = Date.valueOf(LocalDate.now());
			
			bookDao.updateBook(bookObj);
			studentDao.updateStudent(studentObj);
			recordDao.updateRecord(recObj);

			DbConnection.getConnection().commit();

		} 
		catch (Exception e)
		{
			e.printStackTrace();
			try
			{
				DbConnection.getConnection().rollback();
			} 
			catch (SQLException e1)
			{
				e1.printStackTrace();
			}
		}
	}
	public void returnBook(int bid)
	{
		Book bookObj = bookDao.findById(bid);
		int recid = bookObj.recid ;
		Record recordObj = recordDao.findById(recid);
		int sid = recordObj.sid;
		Student studentObj = studentDao.findById(sid);
		bookObj.recid = 0;
		recordObj.retDate = Date.valueOf(LocalDate.now());
		recordObj.fine = calcFine(recordObj);
		studentObj.num--;

		bookDao.updateBook(bookObj);
		studentDao.updateStudent(studentObj);
		recordDao.updateRecord(recordObj);
	}
	private int calcFine(Record rec)
	{
		return 10;
	}
	public Book addBook(String title, String author)
	{
		//bid=I will generate, title , author, recid = 0
		Book book = new Book(0, title, author, 0);
		book = bookDao.addBook(book);
		return book;
	}


}
