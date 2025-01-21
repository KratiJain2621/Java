package com.dk.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import com.dk.model.Record;

public class RecordDaoImpl implements RecordDao
{
	private static Logger log = Logger.getLogger(RecordDaoImpl.class);
	EntityManager em = EmfProvider.getEm();
	@Override
	public Record findById(int recid)
	{
		return em.find(Record.class, recid);
	}
	@Override
	public Record updateRecord(Record record)
	{
		try
		{
		em.persist(record);
		return record;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Record addRecord(Record record)
	{
		try
		{
		em.persist(record);
		return record;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean removeRecord(Record record)
	{
		Record recordIndb = em.find(Record.class,record.getRecid());
		if(recordIndb != null)
		{
			em.remove(recordIndb);
			return true;
		}
		return false;
	}

	@Override
	public List<Record> findAll()
	{
		//can not write SQL 
		//JPAQL : Java Persistence API Query Language as Sql
		//HQL : Hibernate Query Language
		Query query = em.createQuery("select r from Record r");
		List<Record> list = query.getResultList();
		//put all in the list of Record
		return list;
	}

}
