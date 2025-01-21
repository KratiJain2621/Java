package com.dk;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

import com.dk.dao.BookDao;
import com.dk.dao.BookDaoImpl;
import com.dk.dao.EmfProvider;
import com.dk.dao.StudentDao;
import com.dk.dao.StudentDaoImpl;
import com.dk.service.LibService;
import com.dk.service.LibServiceImpl;

public class TestJpaConnection
{
	private static Logger log = Logger.getLogger(TestJpaConnection.class);
	public static void main(String[] args)
	{
		// INVALIDATE HIBERNATE CACHE
		// EMAIL VERIFY : Action : em.detach (entity) remove from cache
		// fetch entity again: fresh from DB
		// java app verify : what will it will update the database
		// call some api for other application where other app is waiting 
		// to java app jms queue 
		// RabbitMQ, ActiveMQ , Kafka jmsque.receive(message);
		// Single application Future
		// Code Thread 
		
		EntityManagerFactory emf  = null;
		EntityManager em = null;
		try
		{
			
			
			BookDao bdao = new BookDaoImpl();
			StudentDao sdao = new StudentDaoImpl();
			
			LibService libService = new LibServiceImpl();
			int bid= 25;
			int sid= 16;
			log.info(sdao.findById(sid));
//			libService.issueBook(bid,sid);
//			libService.returnBook(bid);
			log.info("book after issue " + bdao.findById(bid));
			log.info("student after getting issued " + sdao.findById(sid));
			//check the database
			
			libService.getBooksIssued(16).forEach(log::debug);
		}
		finally
		{		
			EmfProvider.getEm().close();
			EmfProvider.getEmf().close();
		}

	}


}
