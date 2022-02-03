package com.mph.service;

import java.util.List;

import com.mph.entity.Student;

public interface StudentService {

	public void addStudent(Student student);
	public List<Student> getAllStudent();

	public List<Student> updateStudent(Student student);
	public List<Student> deleteStudent(int std);
	public Student getStudent(int std);
}
