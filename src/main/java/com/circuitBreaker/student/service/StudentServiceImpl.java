package com.circuitBreaker.student.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.circuitBreaker.student.view.Student;
import com.circuitBreaker.student.view.StudentList;

@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public StudentList getAllStudents() {
		Student studentData = new Student();
		StudentList response = new StudentList();
		List<Student> studentList = new ArrayList<Student>();
		
		studentData.setName("Mark");
		studentData.setGender("Male");
		studentData.setAge(20);
		studentData.setStd("12th");
		studentData.setSchoolName("Washington Junior High School");
		studentList.add(studentData);
		
		Student jessiData = new Student();
		jessiData.setName("jessi");
		jessiData.setGender("female");
		jessiData.setAge(21);
		jessiData.setStd("12th");
		jessiData.setSchoolName("Washington Junior High School");
		studentList.add(jessiData);
		
		Student amandaData = new Student();
		amandaData.setName("Amanda");
		amandaData.setGender("female");
		amandaData.setSchoolName("newYork senior High School");
		amandaData.setAge(18);
		amandaData.setStd("10th");
		studentList.add(amandaData);
		
		Student jerryData = new Student();
		jerryData.setName("Amanda");
		jerryData.setGender("female");
		jerryData.setSchoolName("los angeles High School");
		jerryData.setAge(15);
		jerryData.setStd("8th");
		studentList.add(jerryData);
		
		
		response.setStudentList(studentList);
		
		return response;
	}

	@Override
	public StudentList getstudentDataSchool(String SchoolName) {
		StudentList allStudents = getAllStudents();
		List<Student> studentList = new ArrayList<Student>();
		StudentList studentlistResponse = new StudentList();
		
		for (Student element : allStudents.getStudentList()) {
			if(SchoolName.equalsIgnoreCase(element.getSchoolName())) {
				studentList.add(element);
			}
			
		}
		studentlistResponse.setStudentList(studentList);
		
		return studentlistResponse;
	}

}
