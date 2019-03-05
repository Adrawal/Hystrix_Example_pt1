package com.circuitBreaker.student.service;

import com.circuitBreaker.student.view.StudentList;

public interface StudentService {
	
	public StudentList getAllStudents();
	
	public StudentList getstudentDataSchool(String SchoolName);

}
