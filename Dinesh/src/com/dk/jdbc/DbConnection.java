package com.dk.jdbc;

import java.sql.Connection;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DbConnection
{
	private static Connection connection=null;

	public static Connection getConnection()
	{
		try
		{
			if(connection !=null && ! connection.isClosed())
				return connection;

			MysqlDataSource ds = new MysqlDataSource();
			ds.setUser("root");
			ds.setPassword("password");
			ds.setUrl("jdbc:mysql://localhost:3306/guardian22?useSSL=false");

			connection = ds.getConnection();
			return connection;
		}
		catch(Exception e)
		{
			return null;
		}
	}
	public static Connection getConnection(String user, String pass, String url)
	{
		try
		{
			if(connection !=null && ! connection.isClosed())
				return connection;

			MysqlDataSource ds = new MysqlDataSource();
			ds.setUser(user);
			ds.setPassword(pass);
			ds.setUrl(url);

			connection = ds.getConnection();
			return connection;
		}
		catch(Exception e)
		{
			return null;
		}
	}
	public static void closeConnection()
	{
		try
		{
			connection.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
