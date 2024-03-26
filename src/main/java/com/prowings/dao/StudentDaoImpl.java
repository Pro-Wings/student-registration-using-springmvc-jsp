package com.prowings.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prowings.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao{

//	@Autowired
//	SessionFactory sessionFactory;
	
	@Override
	public void saveStudent(Student student) {
		System.out.println("inside saveStudent() of StudentDaoImpl");
		
	}

	@Override
	public List<Student> getStudentsList() {
		System.out.println("inside getStudentsList() of StudentDaoImpl");
		return null;
	}

}
