package com.mph.dao;

import java.util.List;

import com.mph.entity.Student;


public interface StudentDao {

	public void addStudent(Student student);
	public List<Student> getAllStudent();

	public List<Student> updateStudent(Student student);
	public List<Student> deleteStudent(int std);
	public Student getStudent(int std);
}
