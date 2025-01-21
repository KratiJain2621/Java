package com.dk.dao;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManager;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dk.model.Department;
import com.dk.model.Employee;
import com.dk.model.Parking;
import com.dk.model.Project;

/*
 * child table has Forign Key
 * Table with Foeign key : Many 
 * Other table is ONe Parent
 * many emp work in one department
 * 
 */


public class AllEntityMappingTest
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
	public void testEmp()
	{
		EntityManager em = EmfProvider.getEm();
		Employee emp = em.find(Employee.class,101);
		System.out.println(emp);
		assertNotNull(emp);
	}
	@Test
	public void testDept()
	{
		EntityManager em = EmfProvider.getEm();
		Department dept = em.find(Department.class,1);
		System.out.println(dept);
		assertNotNull(dept);
	}
	@Test
	public void testParking()
	{
		EntityManager em = EmfProvider.getEm();
		Parking parking = em.find(Parking.class,1);
		System.out.println(parking);
		assertNotNull(parking);
	}
	@Test
	public void testProject()
	{
		EntityManager em = EmfProvider.getEm();
		Project project = em.find(Project.class,1);
		System.out.println(project);
		assertNotNull(project);
	}

}
