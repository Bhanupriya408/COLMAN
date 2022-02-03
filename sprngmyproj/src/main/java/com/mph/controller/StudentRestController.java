package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.mph.entity.Student;
import com.mph.service.StudentService;
@Controller
@RestController
@RequestMapping("/student")
@CrossOrigin(allowCredentials = "false",allowedHeaders =  "*"  ,origins = "http://localhost:4200",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE} )
public class StudentRestController {

	@Autowired
	public StudentService studentService;

	
	@GetMapping("/stdlist")
	public ResponseEntity<List<Student>> listAllStudents() {
		List<Student> li = studentService.getAllStudent();
		if (li.isEmpty()) {
			return new ResponseEntity<List<Student>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Student>>(li,HttpStatus.OK);
	}
	
	@RequestMapping("/stdlist/{sid}")
      public ResponseEntity<Student> getStudent(@PathVariable("sid") int id) {
        
		Student student = studentService.getStudent(id);
    	if (student == null) {
			return new ResponseEntity<Student>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<Student>(student,HttpStatus.OK);
  
	}
	@PostMapping("/addStd")
	public Student addStudent(@RequestBody Student student) {
		studentService.addStudent(student);
		return student;
	}

	@PutMapping("/updateStd")
	public ResponseEntity<List<Student>> updateStudent(@RequestBody Student student) {
		List<Student> li = studentService.updateStudent(student);
		
		if (li.isEmpty()) {
			return new ResponseEntity<List<Student>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Student>>(li,HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteStd/{id}")
	public ResponseEntity<List<Student>> deleteStudent(@PathVariable("id") int sid) {
		List<Student> li = studentService.deleteStudent(sid);
		if (li.isEmpty()) {
			return new ResponseEntity<List<Student>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Student>>(li,HttpStatus.OK);
	}
	
	
}
