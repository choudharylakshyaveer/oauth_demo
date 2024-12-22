package com.studentService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.studentService.dao.StudentDAO;
import com.studentService.model.Student;

import reactor.core.publisher.Flux;


@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentDAO dao;
	
	@Override
	public Flux<Student> getStudentsByStandard(Integer standard) {
		return dao.getStudentsByStandard(standard);
	}

}
