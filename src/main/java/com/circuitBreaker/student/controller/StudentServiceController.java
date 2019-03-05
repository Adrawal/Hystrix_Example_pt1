package com.circuitBreaker.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.circuitBreaker.student.service.StudentService;
import com.circuitBreaker.student.view.StudentList;

@RestController
@RequestMapping("/StudentService")
public class StudentServiceController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/getallStudent")
	public StudentList getStudents() {
		
		return studentService.getAllStudents();
		
		
	}
	
	

}
