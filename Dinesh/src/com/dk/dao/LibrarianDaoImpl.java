package com.dk.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dk.jdbc.DbConnection;
import com.dk.model.Book;
import com.dk.model.Librarian;

public class LibrarianDaoImpl
{
	public Librarian findById(int sid)
	{
		Connection connection = DbConnection.getConnection();
		try
		{
			PreparedStatement pst = connection.prepareStatement("select * from librarian where librid=?");
			pst.setInt(1, sid);
			ResultSet resultSet = pst.executeQuery();
			if(resultSet.next() == false) //no row at all
				return null;
			//i am at 1st row let us read the data
			int sid1 = resultSet.getInt("librid");
			String name = resultSet.getString("name");
			String password = resultSet.getString("password");

			Librarian s = new Librarian(sid1, name, password);
			return s;
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			return null;
		}
	}


}
