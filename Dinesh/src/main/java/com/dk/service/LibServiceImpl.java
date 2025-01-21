package com.dk.service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import com.dk.dao.BookDao;
import com.dk.dao.BookDaoImpl;
import com.dk.dao.EmfProvider;
import com.dk.dao.RecordDao;
import com.dk.dao.RecordDaoImpl;
import com.dk.dao.StudentDao;
import com.dk.dao.StudentDaoImpl;
import com.dk.model.Book;
import com.dk.model.Record;
import com.dk.model.Student;

public class LibServiceImpl implements LibService
{
	private static Logger log = Logger.getLogger(LibServiceImpl.class);
	
	EntityManager em = EmfProvider.getEm();
	BookDao bookDao = new BookDaoImpl();
	StudentDao studentDao = new StudentDaoImpl();
	RecordDao recordDao = new RecordDaoImpl(); //control shift O
	//select b from Book b where b.bid = 87; 
	//select b.bid, b.title from book b;
	
	@Override
	public boolean issueBook(int bid, int sid)
	{
		log.debug("issueing book " + bid +  " to " + sid);
		EmfProvider.getEm().getTransaction().begin();

		log.trace("trasanction started");
		try
		{
		Book bookObj = bookDao.findById(bid);
		log.trace("found book " + bookObj);
		Student studentObj =studentDao.findById(sid);
		log.trace("found student " + studentObj);
		Record recObj = new Record(); 
		studentObj.setNum(studentObj.getNum() + 1);
		recObj.setSid(sid);
		recObj.setBid(bid);
		recObj.setIsDate( Date.valueOf(LocalDate.now() ) ) ;
		recordDao.addRecord(recObj); //allocated new recid now set in the book
		log.trace("got new record " + recObj);
		
		bookObj.setRecid(recObj.getRecid());
		
		bookDao.updateBook(bookObj);
		studentDao.updateStudent(studentObj);
		recordDao.updateRecord(recObj);

		log.trace("committing the transaction");
		EmfProvider.getEm().getTransaction().commit();
		}
		catch(Exception e)
		{
			log.error(e);
			EmfProvider.getEm().getTransaction().rollback();
			return false;
		}
		return true;
	}

	@Override
	public boolean returnBook(int bid)
	{
		em.getTransaction().begin();
		
		Book bookObj = bookDao.findById(bid);
		int recid = bookObj.getRecid() ;
		Record recordObj = recordDao.findById(recid);
		int sid = recordObj.getSid();
		Student studentObj = studentDao.findById(sid);
		bookObj.setRecid(0);
		recordObj.setRetDate(Date.valueOf(LocalDate.now())) ;
		recordObj.setFine(calcFine(recordObj));
		studentObj.setNum(studentObj.getNum() -1);

		bookDao.updateBook(bookObj);
		studentDao.updateStudent(studentObj);
		recordDao.updateRecord(recordObj);

		em.getTransaction().commit();

		return true;
	}
	public List<Book> getBooksIssued(int sid)
	{
		//not using stream  api filter No
		// write HQL QUERY 
		String hql = "select b from Book b where b.bid in (select r.bid from"
				+ " Record r where r.retDate is null and r.sid = :sid) ";
		Query query = em.createQuery(hql);
		query.setParameter("sid", sid);
		List<Book> list = query.getResultList();
		log.debug("books issued to  " + sid  + " " + list);
		return list;
		
	}

	private int calcFine(Record recordObj)
	{
		return 10;
	}

}
