package com.example.demo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.models.Student;

public interface StudentRepository extends MongoRepository<Student,Integer>{

	List<Student> findAll();
	
	
}
