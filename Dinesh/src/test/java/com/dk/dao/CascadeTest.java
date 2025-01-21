package com.dk.dao;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManager;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dk.model.Employee;
import com.dk.model.Parking;

/*
 * child table has Forign Key
 * Table with Foeign key : Many 
 * Other table is ONe Parent
 * many emp work in one department
 * 
 */


public class CascadeTest
{
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
	public void testParking()
	{
		EntityManager em = EmfProvider.getEm();
		em.getTransaction().begin();
		
		Employee emp = new Employee(112,"New emp2", null); //not managed entity
		//not attached to em
		//transient entity
		
		Parking parking = new Parking(10,2,emp);
//		em.persist(emp);
		em.persist(parking);
		System.out.println(emp);
		assertNotNull(emp);
		
		em.getTransaction().commit();
	}

}
