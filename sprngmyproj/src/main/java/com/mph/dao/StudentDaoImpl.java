package com.mph.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.mph.entity.Student;

@Repository
public class StudentDaoImpl implements StudentDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(student);
		System.out.println("Student added successfully...");

		
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		Query qry = getSession().createQuery("select s from Student s");
		List<Student> stdlist = qry.list();
		System.out.println("student list from dao : " + stdlist);
		return stdlist;
	}



	@Override
	public List<Student> updateStudent(Student student) {
		// TODO Auto-generated method stub
		Query qry = getSession()
				.createQuery(" update Student s set sname=:sname,phno=:phno,gender=:gender,address=:address,busno=:busno,status=:status where sid=:sid");
		qry.setParameter("sname", student.getSname());
		qry.setParameter("phno", student.getPhno());
		qry.setParameter("gender", student.getGender());
		qry.setParameter("address",student.getAddress());
		qry.setParameter("busno",student.getBusno());
		qry.setParameter("status",student.getStatus());	
		qry.setParameter("sid", student.getSid());
		
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Updated " + noofrows + " rows. ");
		}
		return getAllStudent();
		
	}

	@Override
	public List<Student> deleteStudent(int sid) {
	
		Query qry = getSession().createQuery(" delete Student  e where sid=:sid");
		qry.setParameter("sid", sid);
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Deleted " + noofrows + " rows. ");
		}
		return getAllStudent();
	}

	@Override
	public Student getStudent(int id) {
		Query qry = getSession().createQuery("from Student s where sid=:id");
		qry.setParameter("id", id);
		Student std = (Student) qry.uniqueResult();
		System.out.println("search result : " + std);
		return std;	
	}

}
