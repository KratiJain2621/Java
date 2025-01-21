package com.dk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dk.jdbc.DbConnection;
import com.dk.model.Book;
/*
 * STANDARD
 * JPA : JAVA PERSISTENCE API : SPECIFICATION 
 * what classes, what interfaces, exceptions  What should be effect of each method
 * No Implementations
 * 
 * 
 * 1. Hibernate Framework : already there doing same job Lot of methods
 * 2. EclipseLink
 * 3. TopLink
 * .
 * Model Class  
 * Database Table 
 * Mapping file (which data member of class <-> attribute in table)
 * class STudebt
 * {int sid ;
 * }
 * Table 
 * Student
 * roll
 * I will write all queries for you update the object automatically
 * 
 * 
 * 
 * class Usergetter
 * class UserProvider
 */

public class BookDaoImpl
{
	public List<Book> findAll()
	{
		Connection connection = DbConnection.getConnection();
		List<Book> list = new ArrayList<>();
		try
		{
			PreparedStatement pst = connection.prepareStatement("select * from book");
			ResultSet resultSet = pst.executeQuery();

			while(resultSet.next())
			{
				//i am at 1st row let us read the data
				int bid1 = resultSet.getInt("bid");
				String title = resultSet.getString("title");
				String author = resultSet.getString("author");
				int recid = resultSet.getInt("recid");
				Book b = new Book(bid1,title,author,recid);
				list.add(b);
			}
			return list;
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			return list;
		}
	}
	public Book findById(int bid)
	{
		Connection connection = DbConnection.getConnection();
		try
		{
			PreparedStatement pst = connection.prepareStatement("select * from book where bid=?");
			pst.setInt(1, bid);
			ResultSet resultSet = pst.executeQuery();
			if(resultSet.next() == false) //no row at all
				return null;
			//i am at 1st row let us read the data
			int bid1 = resultSet.getInt("bid");
			String title = resultSet.getString("title");
			String author = resultSet.getString("author");
			int recid = resultSet.getInt("recid");
			Book b = new Book(bid,title,author,recid);
			return b;
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			return null;
		}
	}

	public boolean updateBook(Book bk)
	{
		Connection connection = DbConnection.getConnection();
		try
		{
			PreparedStatement pst = connection.prepareStatement("update book set title = ?, author=?, recid = ? where bid = ?");
			pst.setString(1, bk.title);
			pst.setString(2, bk.author);
			pst.setInt(3, bk.recid);
			pst.setInt(4, bk.bid);

			int rows = pst.executeUpdate();
			if(rows != 1)
				return false;
			//i am at 1st row let us read the data
			return true;
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			return false;
		}
	}
	public Book addBook(Book book)
	{
		
		Connection connection = DbConnection.getConnection();
		try
		{
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select max(bid) from book");
			//just one row just one col
			rs.next();
			int maxid = rs.getInt(1);
			book.setBid(maxid+1);
			
			String sql = " insert into book values (?,?,?,?)";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setInt(1, book.bid);
			pst.setString(2,book.title);
			pst.setString(3,book.author);
			pst.setInt(4, 0);
			
			int rows = pst.executeUpdate();
			if(rows == 1)
				return book;
			else return null;
			
			
		} catch (SQLException e)
		{
			e.printStackTrace();
			return null;
		}
	}

}
