package com.dk.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.dk.dao.BookDaoImpl;
import com.dk.dao.RecordDaoImpl;
import com.dk.dao.StudentDaoImpl;
import com.dk.model.Book;
import com.dk.model.Record;
import com.dk.model.Student;
import com.dk.service.LibraryServiceImpl;
import com.mysql.cj.jdbc.MysqlDataSource;
/*
 * create a new java project
 * rt click project, build path - configure build path
 * Libraries - add external jars - slelect jar file
 * apply and close
 * jar is visible in referenced libraries
 * 
 * 
 * -> reslutSet is pointing to line 0 (nothing) resultSet.next() goto next line
 *    empid	name
 * -> 101   ajay
 * -> 102	aman
 * -> 103   bipul
 * FALSE
 */

public class DbConnectionTest
{
	public static void main(String[] args)
	{
		try
		{
			BookDaoImpl bookDao = new BookDaoImpl();
			StudentDaoImpl sdao = new StudentDaoImpl();
			RecordDaoImpl rdao = new RecordDaoImpl();
			LibraryServiceImpl service = new LibraryServiceImpl();
			
			Book book15 = bookDao.findById(15);
			System.out.println(book15);
			book15.author = "Herbert Schildt";
			bookDao.updateBook(book15);
			Student student = sdao.findById(11);
			System.out.println(student);
			
			Record record = rdao.findById(1);
			System.out.println(record);
			
			service.issueBook(15,11);
			System.out.println("after issue book");
			book15 = bookDao.findById(15);
			System.out.println(book15);
			student = sdao.findById(11);
			System.out.println(student);
			
			
		
		}
		finally
		{
			DbConnection.closeConnection();
		}
	}
}
