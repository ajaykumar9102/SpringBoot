package com.example.demo.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.crud.model.Student;
import com.example.demo.crud.repository.Studentrepo;

@Service
public class Studentservice {
	@Autowired
	Studentrepo studentrepo;
	public void createStudent(Student student) {
		studentrepo.save(student);
	}
public Student readStudentById(int val) {
	return studentrepo.findById(val).get();
}
public void updateName(Student student,int val) {
	Student existingname=readStudentById(val);
	existingname.setName(student.getName());
	studentrepo.save(existingname);
}public void deleteStudentById(int val) {
	studentrepo.deleteById(val);
}
}
