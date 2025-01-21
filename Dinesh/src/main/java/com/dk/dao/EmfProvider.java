package com.dk.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

public class EmfProvider
{
	private static Logger log = Logger.getLogger(EmfProvider.class);
	private static EntityManager em = null;
	private static EntityManagerFactory emf = null;

	public static EntityManagerFactory getEmf()
	{
		if(emf == null || ! emf.isOpen())
			emf = Persistence.createEntityManagerFactory("libPersistenceUnit");
		return emf;
	}
	public static EntityManager getEm()
	{
		if(emf == null || ! emf.isOpen())
		{
			getEmf();
			em = emf.createEntityManager();
		}
		else if (em== null || ! em.isOpen())
		{
			em = emf.createEntityManager();
		}
		//if em is not null
		return em;
	}
}

