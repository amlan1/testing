package com.amlan.rentCar.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amlan.rentCar.model.Student;
import com.amlan.rentCar.repositoryDao.StudentRepositoryDao;
import com.amlan.rentCar.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	StudentRepositoryDao studentDao;
	
	@Override
	public Student save(Student student) {
		
		return studentDao.save(student);
	}

	@Override
	public Student fetchStudentById(int id) {
 
		Optional<Student> student= studentDao.findById(id);
		if(student.isPresent()) {
			return student.get();
		}else{
			return null;
		}
	}

	@Override
	public List<Student> getAllStudent() {
 
		return studentDao.findAll();
	}

	@Override
	public void deleteStudent(int id) {
 		
		studentDao.deleteById(id);;
	}

	@Override
	public void deleteAll() {
		
		studentDao.deleteAll();
	}

	


}
