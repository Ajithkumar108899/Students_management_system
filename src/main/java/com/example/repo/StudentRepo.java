package com.example.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Student;

@Repository
public interface StudentRepo extends CrudRepository<Student,Integer> {

}
