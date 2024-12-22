package com.studentService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;

import com.studentService.model.Student;
import com.studentService.service.StudentService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/students/{standard}")
	public Mono<ResponseEntity<Student>> getStudentsByDivision(ServerWebExchange exchange, @PathVariable Integer standard) {

		Flux<Student> students = studentService.getStudentsByStandard(standard);
		return Mono.just(new ResponseEntity(students, HttpStatus.OK)); //http runs
	}
}
