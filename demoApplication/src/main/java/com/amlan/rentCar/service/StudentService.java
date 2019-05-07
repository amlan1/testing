package com.amlan.rentCar.service;

import java.util.List;
import com.amlan.rentCar.model.Student;

public interface StudentService {

	public Student save(Student student);
	public Student fetchStudentById(int id);
	public List<Student> getAllStudent();
	public void deleteStudent(int id);
	public void deleteAll();
	
	
	
}
