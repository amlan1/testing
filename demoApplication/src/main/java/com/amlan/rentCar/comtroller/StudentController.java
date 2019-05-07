package com.amlan.rentCar.comtroller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amlan.rentCar.model.Student;
import com.amlan.rentCar.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping(path = "student")
	public Map<String, Object> saveStudent(@RequestBody Student student){
		Map<String, Object> map=new HashMap<>();
		studentService.save(student);
		
		map.put("message", "Up");
		map.put("Student", student);
		map.put("code", "200");
		
		return map;
		
	}
	/*
	@GetMapping(path = "student/{id}")
	public Map<String, Object> getStudent(@PathVariable ("id") int id){
		Map<String, Object> map=new HashMap<>();
		Student student=studentService.fetchStudentById(id);
		
		map.put("message", "Up");
		map.put("Student", student);
		map.put("code", "200");
		
		return map;
		
	}
	*/
	@GetMapping(path = "student")
	public ResponseEntity<Student> getStudent(@RequestParam ("id") int id){
		Student student=studentService.fetchStudentById(id);
		if(student==null) {
			return ResponseEntity.notFound().build();
		}else {
			return ResponseEntity.ok().body(student);
		}
	}
	
	@GetMapping(path = "students")
	public Map<String, Object> getAllStudent(){
		Map<String, Object> map=new HashMap<>();
		List<Student> students=studentService.getAllStudent();
		
		map.put("message", "Up");
		map.put("Student", students);
		map.put("code", "200");
		
		return map;
		
	}
	@DeleteMapping(path = "student/{id}")
	public Map<String, Object> deleteStudent(@PathVariable ("id") int id){
		Map<String, Object> map=new HashMap<>();
		studentService.deleteStudent(id);
		
		map.put("message", "Up");
		map.put("Student", "Deleted");
		map.put("code", "200");
		
		return map;
		
	}
	@DeleteMapping(path = "students")
	public Map<String, Object> deleteAllStudent(){
		Map<String, Object> map=new HashMap<>();
		studentService.deleteAll();
		
		map.put("message", "Up");
		map.put("Student", "Deleted all");
		map.put("code", "200");
		
		return map;
		
	}
	

}
