package com.example.demo.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.crud.model.Ajay;
import com.example.demo.crud.repository.Ajayrepo;
import com.example.demo.crud.repository.Vikashrepo;

@Service
public class Ajayservice {
	@Autowired
	Ajayrepo ajayrepo;
	@Autowired
	Vikashrepo vikashrepo;
	public void createAjay(Ajay ajay) {
		ajayrepo.save(ajay);
	}
	public Ajay getAjaybyId(int id) {
		return ajayrepo.findById(id).get();
	}
	public void updatebyId(Ajay ajay,int id) {
		Ajay existingdata=getAjaybyId(id);
		existingdata.setAge(ajay.getAge());
		existingdata.setName(ajay.getName());
		ajayrepo.save(existingdata);
	}public void deletebyId(int id) {
		ajayrepo.deleteById(id);
	}

}
