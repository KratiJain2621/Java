package com.dk.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import com.dk.model.Student;

public class StudentDaoImpl implements StudentDao
{
	private static Logger log = Logger.getLogger(StudentDaoImpl.class);

	EntityManager em = EmfProvider.getEm();
	@Override
	public Student findById(int sid)
	{
		log.debug("finding student with id " + sid);
		return em.find(Student.class, sid);
	}
	@Override
	public Student updateStudent(Student student)
	{
		log.debug("updating student " + student);
		try
		{
		em.persist(student);
		return student;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Student addStudent(Student student)
	{
		try
		{
		em.persist(student);
		return student;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean removeStudent(Student student)
	{
		Student studentIndb = em.find(Student.class,student.getSid());
		if(studentIndb != null)
		{
			em.remove(studentIndb);
			return true;
		}
		return false;
	}

	@Override
	public List<Student> findAll()
	{
		//can not write SQL 
		//JPAQL : Java Persistence API Query Language as Sql
		//HQL : Hibernate Query Language
		Query query = em.createQuery("select s from Student s");
		List<Student> list = query.getResultList();
		//put all in the list of Student
		return list;
	}

}
