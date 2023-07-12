package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;

@RestController
@RequestMapping("/api/Student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("save")
	public String saveStudent(@RequestBody Student student) {
		Optional<Student> student1 = studentService.create(student);
		if (student1.isPresent()) {
			return "The student data has been saved successfully!";
		} else {
			return "Student already exist in records";
		}
	}
	
	@GetMapping
	public List<Student> findAllStudent(){
		return studentService.findAllStudents();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Student> findStudentById(@PathVariable("id") int id){
		Optional<Student> student = studentService.findAllStudentone(id);
		if (student.isPresent()) {
			return new ResponseEntity<>(student.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);

		}
	}
	
	@PutMapping("update")
	public String updateStudent(@RequestBody Student student) {
		Optional<Student> student1 = studentService.update(student);
		if (student1.isEmpty()) {
			return "The student data does not exist in records!";
		} else {
			return "The student data has been updated successfully!";
		}
	}

	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable("id") int id) {
		return studentService.delete(id);
	}
	
	
}

