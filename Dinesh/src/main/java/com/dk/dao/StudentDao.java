package com.dk.dao;

import java.util.List;

import com.dk.model.Student;

public interface StudentDao
{
	Student findById(int bid);
	Student updateStudent(Student student);
	Student addStudent(Student student);
	boolean removeStudent(Student student);
	List<Student> findAll(); //orgranize import control + shift + O , control 1

}
