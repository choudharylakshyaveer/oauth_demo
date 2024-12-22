package com.studentService.dao;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.studentService.model.Student;

import reactor.core.publisher.Flux;


public interface StudentDAO extends ReactiveCrudRepository<Student, String>{

	@Query("{standard:?0}")
	Flux<Student> getStudentsByStandard(Integer division);
}
