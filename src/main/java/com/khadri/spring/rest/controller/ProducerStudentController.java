package com.khadri.spring.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.khadri.spring.rest.entity.Student;
import com.khadri.spring.rest.service.StudentService;

@RestController
public class ProducerStudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/view/student")
	public Student viewStudent() {
		return service.fetchStudent();
	}

}
