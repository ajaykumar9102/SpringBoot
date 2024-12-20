package com.example.demo.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.crud.model.Student;
import com.example.demo.crud.service.Studentservice;

@RestController
public class Studentcrud {
	@Autowired
	Studentservice studentservice;
	@PostMapping(path="create")
	public void createstudent(@RequestBody Student student) {
		studentservice.createStudent(student);
		
	}
	//localhost:8080/read?q=1//
	@GetMapping("read")
	public void readbyid(@RequestParam(name="q")int val) {
		studentservice.readStudentById(val);
	}
	@PutMapping("update")
	public void updatename(@RequestBody Student student,int id) {
		studentservice.updateName(student, id);
		
	}
	@DeleteMapping("delete")
	public void deletebyid(@RequestParam (name="id")int val) {
		studentservice.deleteStudentById(val);
	}
	
	

}
