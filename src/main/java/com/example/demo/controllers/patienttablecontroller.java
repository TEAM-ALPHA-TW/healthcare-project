package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.patienttable;
import com.example.demo.services.patienttableservice;


@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class patienttablecontroller {
	@Autowired
	patienttableservice service;
	@PostMapping("/add14")
	public String add14(@RequestBody patienttable pt) {
		return service.add14(pt);
	}
	@GetMapping("/getall14")
	public List<patienttable> getall14(){
		return service.getall14();
		
	}
	@DeleteMapping("/delete14/{id}")
	public String delete14(@PathVariable Integer id) {

	    return service.delete14(id);

	}
	@PutMapping("/update14/{id}")
	public String update14(@PathVariable Integer id, @RequestBody patienttable pt) {
	    return service.update14(id, pt);
	}

}
