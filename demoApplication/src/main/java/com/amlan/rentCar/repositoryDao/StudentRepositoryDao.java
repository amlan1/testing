package com.amlan.rentCar.repositoryDao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amlan.rentCar.model.Student;

@Repository
public interface StudentRepositoryDao extends JpaRepository<Student, Integer>{//extends repository
	
	//Student save(Student student);
	//if you only extends Repository then this line is mandatory.if you use jpaRepository then this line is not mandatory
}
