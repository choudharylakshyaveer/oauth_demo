package com.registrationService.service;


import com.registrationService.model.Student;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface AllStudentsService {

	public Flux<Student> getAllStudents();
	public Mono<Student> savestudent(Student student);
}
