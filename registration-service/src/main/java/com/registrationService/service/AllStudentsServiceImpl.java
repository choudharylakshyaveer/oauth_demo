package com.registrationService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.registrationService.dao.AllStudentsDao;
import com.registrationService.model.Student;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AllStudentsServiceImpl implements AllStudentsService{

	@Autowired
	AllStudentsDao dao;
	
	@Override
	public Flux<Student> getAllStudents() {
		// TODO Auto-generated method stub
		
		return dao.findAll();
	}

	@Override
	public Mono<Student> savestudent(Student student) {
		
		return dao.save(student);
	}
	
}
