package com.registrationService.dao;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.registrationService.model.Student;

import reactor.core.publisher.Flux;

@Repository
public interface AllStudentsDao extends ReactiveCrudRepository<Student, String>
{

	//public Flux<Student> getStudent();
}
