package com.example.demo.crud.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.crud.model.Ajay;
import com.example.demo.crud.service.Ajayservice;

@RestController
@RequestMapping("/ajay")
public class Ajaycontroller {
	@Autowired
	Ajayservice ajayservice;
	@PostMapping(path="/create")
	public void CreateAjay(@RequestBody Ajay ajay) {
		ajayservice.createAjay(ajay);
	}
	@GetMapping("/read")
	public void getById(@RequestParam (name="i")int id) {
		ajayservice.getAjaybyId(id);
	}@PutMapping("/update")
	public void updateById(@RequestBody Ajay ajay,@RequestParam (name="aj")int id) {
		ajayservice.updatebyId(ajay, id);
	}@DeleteMapping("/delete")
	public void deleteById(@RequestParam (name="i")int id) {
		ajayservice.deletebyId(id);
	}

}
