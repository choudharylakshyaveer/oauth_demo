package com.studentService.service;


import com.studentService.model.Student;

import reactor.core.publisher.Flux;

public interface StudentService {

	public Flux<Student> getStudentsByStandard(Integer standard);
}
