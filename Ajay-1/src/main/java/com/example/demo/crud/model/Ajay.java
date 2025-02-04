package com.example.demo.crud.model;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity

public class Ajay {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private int age;
	@OneToOne(cascade=CascadeType.ALL)
	private Vikash vikash;
	public Vikash getVikash() {
		return vikash;
	}
	public void setVikash(Vikash vikash) {
		this.vikash = vikash;
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
