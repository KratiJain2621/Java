package com.dk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dk.jdbc.DbConnection;
import com.dk.model.Book;
import com.dk.model.Student;


/*
Service : 
		StudentService						LibraryService
		Algo:issueNoDues					Algo issueBook
		checkLogin(userid,password)			returnBook
		List<Book> getBooksIssued(userid)
		changePassword(oldPass, newPass)
		

DAO : StudentDao (interface) StudentDaoImpl   
		BookDao (interface) BookDaoImpl class implements interface
		RecordDao
		LibrarianDao
MODEL CLASS : STUDENT BOOK RECORD LIBRARRIAN  

DATABASE TABLES STUDENT BOOK RECORD LIBRARIAN
*/
public class StudentDaoImpl
{
	public List<Book> findIssuedBooks(int sid)
	{
		Connection connection = DbConnection.getConnection();
		List<Book> list = new ArrayList<>();
		try
		{
			String sql = "select * from book where bid in (select bid from record where sid = ? and retdate is null);";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setInt(1, sid);
			ResultSet resultSet = pst.executeQuery();

			while(resultSet.next())
			{
				//i am at 1st row let us read the data
				int bid = resultSet.getInt("bid");
				String title = resultSet.getString("title");
				String author = resultSet.getString("author");
				int recid = resultSet.getInt("recid");
//				Student s = new Student(sid,name, num);
				Book b = new Book(bid, title, author,recid);

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
	public List<Student> findAll()
	{
		Connection connection = DbConnection.getConnection();
		List<Student> list = new ArrayList<>();
		try
		{
			PreparedStatement pst = connection.prepareStatement("select * from student");
			ResultSet resultSet = pst.executeQuery();

			while(resultSet.next())
			{
				//i am at 1st row let us read the data
				int sid = resultSet.getInt("sid");
				String name = resultSet.getString("name");
				int num = resultSet.getInt("num");
				String phone = resultSet.getString("phone");
				String email = resultSet.getString("email");
				String branch = resultSet.getString("branch");
				String password = resultSet.getString("password");
//				Student s = new Student(sid,name, num);
				Student s = new Student(sid ,name, num, phone, email, branch, password);

				list.add(s);
			}
			return list;
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			return list;
		}
	}
	public Student findById(int sid)
	{
		Connection connection = DbConnection.getConnection();
		try
		{
			PreparedStatement pst = connection.prepareStatement("select * from student where sid=?");
			pst.setInt(1, sid);
			ResultSet resultSet = pst.executeQuery();
			if(resultSet.next() == false) //no row at all
				return null;
			//i am at 1st row let us read the data
			int sid1 = resultSet.getInt("sid");
			String name = resultSet.getString("name");
			String phone = resultSet.getString("phone");
			String email = resultSet.getString("email");
			String branch = resultSet.getString("branch");
			String password = resultSet.getString("password");
			int num = resultSet.getInt("num");
			
			//phone email branch password
			
//			Student s = new Student(sid,name, num);
			Student s = new Student(sid1, name, num, phone, email, branch, password);
			return s;
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			return null;
		}
	}

	public boolean updateStudent(Student student)
	{
		Connection connection = DbConnection.getConnection();
		try
		{
			PreparedStatement pst = connection.prepareStatement("update student set name = ?, num = ? where sid = ?");
			pst.setString(1, student.name);
			pst.setInt(2, student.num);
			pst.setInt(3, student.sid);

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

}
