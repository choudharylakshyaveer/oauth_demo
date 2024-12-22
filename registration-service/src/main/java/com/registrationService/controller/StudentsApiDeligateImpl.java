package com.registrationService.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;

import com.registrationService.model.Student;
import com.registrationService.service.AllStudentsService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
@RestController
public class StudentsApiDeligateImpl
{

	@Autowired
	AllStudentsService allStudentsService;
	
	@GetMapping("/students")
	public Mono<ResponseEntity<Student>> getAllStudents(ServerWebExchange exchange) {

		Flux<Student> students = allStudentsService.getAllStudents();
		return Mono.just(new ResponseEntity(students, HttpStatus.OK)); //http runs
	}
	
	@PostMapping("/student")
	public Mono<ResponseEntity<Student>>  saveUser(@RequestBody Student student){

		return Mono.just(new ResponseEntity(allStudentsService.savestudent(student), HttpStatus.OK));
	}
	
	@GetMapping("/test")
	public Mono<String> getTest(ServerWebExchange exchange){
		return Mono.just("Test API");
	}
	
	
}
