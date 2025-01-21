package com.dk.service;

import java.util.List;

import com.dk.dao.LibrarianDaoImpl;
import com.dk.model.Book;
import com.dk.model.Librarian;
// select * from book where bid in 
// (select bid from record where userid=? and retdate is null) ;

public class LibrarianServiceImpl
{
	LibrarianDaoImpl librarianDao = new LibrarianDaoImpl();
	public Librarian findById(int libid)
	{
		return librarianDao.findById(libid);
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
		Librarian librarian =  librarianDao.findById(sid);
		
		//if librarian is null no such librarian
		if(librarian == null) {System.out.println("no librarian with this id"); return false;}
		if(password.equals(librarian.getPassword() ) )
		{
			System.out.println("password matchec");
			return true;
		}
		System.out.println("pwd did not match");
		return false;
	}
}
