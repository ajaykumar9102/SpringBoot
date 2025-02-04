package com.example.demo.crud.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity

public class Vikash {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String name;
private int age;
@OneToOne(mappedBy="vikash")
private Ajay ajay;
public Ajay getAjay() {
	return ajay;
}
public void setAjay(Ajay ajay) {
	this.ajay = ajay;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}
