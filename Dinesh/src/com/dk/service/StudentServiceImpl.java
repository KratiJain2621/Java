package com.dk.service;

import java.util.List;

import com.dk.dao.StudentDaoImpl;
import com.dk.model.Book;
import com.dk.model.Student;
// select * from book where bid in 
// (select bid from record where userid=? and retdate is null) ;

public class StudentServiceImpl
{
	StudentDaoImpl studentDao = new StudentDaoImpl();

	public List<Book> findIsssuedBooks(String userid)
	{
		try
		{
			int sid = Integer.parseInt(userid);
			return studentDao.findIssuedBooks(sid);
		}
		catch(Exception e)
		{
			return null;
		}
	}

	public boolean checkLogin(String userid, String password)
	{
		//userid should be an integer
		System.out.println("trying to check login for " + userid + " with password " + password);
		int sid= 0;
		try
		{
			sid = Integer.parseInt(userid);
		}
		catch(Exception e)
		{
			return false;
		}
		Student student =  studentDao.findById(sid);
		
		//if student is null no such student
		if(student == null) {System.out.println("no student with this id"); return false;}
		if(password.equals(student.getPassword() ) )
		{
			System.out.println("password matchec");
			return true;
		}
		System.out.println("pwd did not match");
		return false;
	}
}
