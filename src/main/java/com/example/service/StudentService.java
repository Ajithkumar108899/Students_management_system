package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.repo.StudentRepo;

import com.example.model.Student;

@Service
public class StudentService{

	@Autowired
	private StudentRepo studentRepo;
	
	// create Service method
	public Optional<Student> create(Student student) {
		if (studentRepo.existsById(student.getId())) {
			return Optional.empty();
		} else {
			return Optional.of(studentRepo.save(student));
		}
	}

	
	// read or retrieve Service method
	public List<Student> findAllStudents() {
		// It returns a list so casting is needed
		return (List<Student>)studentRepo.findAll();
	}
	
	public Optional<Student> findAllStudentone(int id) {
		// TODO Auto-generated method stub
		return studentRepo.findById(id);
	}
	
	// update Service method
	public Optional<Student> update(Student student) {
		if (studentRepo.existsById(student.getId())) {
			return Optional.of(studentRepo.save(student));
		} else {
			return Optional.empty();
		}
	}
	
	// delete Service method
	public String delete(int id) {
		if (studentRepo.existsById(id)) {
			studentRepo.deleteById(id);
			return id + "delete successfully!";
		} else {
			return "The student data does not exist in records!";
		}
	}

	
}
