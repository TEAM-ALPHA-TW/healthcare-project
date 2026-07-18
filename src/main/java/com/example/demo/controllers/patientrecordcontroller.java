package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.patientrecords;
import com.example.demo.services.patientrecordservice;


@RestController
@RequestMapping("/api/v1")
public class patientrecordcontroller {
	@Autowired
	patientrecordservice service;
	@PostMapping("/add11")
	public String add11(@RequestBody patientrecords pr) {
		return service.add11(pr);
	}
	@GetMapping("/getall11")
	public List<patientrecords> getall11(){
		return service.getall11();
		
	}

}
