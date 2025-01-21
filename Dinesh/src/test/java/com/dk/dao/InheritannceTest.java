package com.dk.dao;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManager;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.dk.model.HomeOrder;
import com.dk.model.RegularOrder;
import com.dk.model.UrgentOrder;

public class InheritannceTest
{
	static EntityManager em = EmfProvider.getEm();
	@BeforeClass
	public static void setUp()
	{
		EmfProvider.getEmf();
		EmfProvider.getEm();
	}
	@AfterClass
	public static void closeConn()
	{
		EmfProvider.getEm().close();
		EmfProvider.getEmf().close();
	}

	@Test
	@Ignore
	public void testSingleTable()
	{
		RegularOrder regOrder = em.find(RegularOrder.class, 2);
		assertNotNull(regOrder);
		System.out.println(regOrder);
		
		UrgentOrder uOrder = em.find(UrgentOrder.class, 1);
		assertNotNull(uOrder);
		System.out.println(uOrder);
	}
	@Test
	@Ignore
	public void testTablePerClass()
	{
		RegularOrder regOrder = em.find(RegularOrder.class, 5);
		assertNotNull(regOrder);
		System.out.println(regOrder);
		
		UrgentOrder uOrder = em.find(UrgentOrder.class, 3);
		assertNotNull(uOrder);
		System.out.println(uOrder);
		
		HomeOrder hOrder = em.find(HomeOrder.class, 2);
		assertNotNull(hOrder);
		System.out.println(hOrder);
		em.createQuery("select o from HomeOrder o").getResultList().forEach(System.out::println);
	}
	
	@Test
	public void testJoined()
	{
		RegularOrder regOrder = em.find(RegularOrder.class, 1);
		assertNotNull(regOrder);
		System.out.println(regOrder);
		
		UrgentOrder uOrder = em.find(UrgentOrder.class, 2);
		assertNotNull(uOrder);
		System.out.println(uOrder);
	}
}
