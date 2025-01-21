package com.dk.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.dk.jdbc.DbConnection;
import com.dk.model.Record;


public class RecordDaoImpl
{
	public List<Record> findAllByRetDateNull()
	{
		return null;
	}
//	public List<Record> findAll()
//	{
//		Connection connection = DbConnection.getConnection();
//		List<Record> list = new ArrayList<>();
//		try
//		{
//			PreparedStatement pst = connection.prepareStatement("select * from record");
//			ResultSet resultSet = pst.executeQuery();
//
//			while(resultSet.next())
//			{
//				//i am at 1st row let us read the data
//				int recid = resultSet.getInt("recid");
//				String name = resultSet.getString("name");
//				int num = resultSet.getInt("num");
//				Record s = new Record(recid,name, num);
//				list.add(s);
//			}
//			return list;
//		} 
//		catch (SQLException e)
//		{
//			e.printStackTrace();
//			return list;
//		}
//	}
	public Record findById(int recid)
	{
		Connection connection = DbConnection.getConnection();
		try
		{
			PreparedStatement pst = connection.prepareStatement("select * from record where recid=?");
			pst.setInt(1, recid);
			ResultSet resultSet = pst.executeQuery();
			if(resultSet.next() == false) //no row at all
				return null;
			//i am at 1st row let us read the data
			int recid1 = resultSet.getInt("recid");
			int bid = resultSet.getInt("bid");
			int sid = resultSet.getInt("sid");
			Date isdate = resultSet.getDate("isdate");
			Date retdate = resultSet.getDate("retdate");
			int fine = resultSet.getInt("fine");
			Record rec = new Record(recid,bid, sid, isdate,retdate,fine);
			return rec;
		} 
		catch (SQLException e)
		{
			e.printStackTrace();
			return null;
		}
	}

	public boolean updateRecord(Record record)
	{
		Connection connection = DbConnection.getConnection();
		try
		{
			String sql = "update record set bid = ?, sid = ?, isdate=?, retdate=?, fine=?  where recid = ?";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setInt(1, record.bid);
			pst.setInt(2, record.sid);
			pst.setDate(3, record.isDate);
			pst.setDate(4, record.retDate);
			pst.setInt(5, record.fine);
			pst.setInt(6, record.recid);

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

	public Record addRecord(Record rec)
	{
		//get max vlaue of recid
		Connection connection = DbConnection.getConnection();
		try
		{
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select max(recid) from record");
			//just one row just one col
			rs.next();
			int maxid = rs.getInt(1);
			rec.setRecid(maxid+1);
			
			String sql = " insert into record values (?,?,?,?,?,?)";
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setInt(1, rec.recid);
			pst.setInt(2, rec.bid);
			pst.setInt(3, rec.sid);
			pst.setDate(4, rec.isDate);
			pst.setDate(5, rec.retDate);
			pst.setInt(6, rec.fine);
			
			int rows = pst.executeUpdate();
			if(rows == 1)
				return rec;
			else return null;
			
			
		} catch (SQLException e)
		{
			e.printStackTrace();
			return null;
		}
		
	}

}
