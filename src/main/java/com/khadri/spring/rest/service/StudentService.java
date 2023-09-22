package com.khadri.spring.rest.service;

import org.springframework.stereotype.Service;

import com.khadri.spring.rest.entity.AddType;
import com.khadri.spring.rest.entity.Address;
import com.khadri.spring.rest.entity.Faculty;
import com.khadri.spring.rest.entity.Student;
import com.khadri.spring.rest.entity.Subject;

@Service
public class StudentService {

	public Student fetchStudent() {

		Address address = new Address();
		address.setLine1("Stree1");
		address.setLine2("Street1");
		address.setLandMark("Near Datta");
		address.setAddType(AddType.PRESENT);
		address.setPinCode("5000591");

		Faculty faculty = new Faculty();
		faculty.setName("Roy Field");
		faculty.setSubject(Subject.SPRING);

		Student student = new Student();
		student.setId(100);
		student.setName("JHON");
		student.setCollege("KHADRI");

		student.setAddress(address);
		student.setFaculty(faculty);

		return student;
	}

}
