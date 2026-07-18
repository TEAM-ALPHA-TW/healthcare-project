package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.patienteligibility;
import com.example.demo.services.patienteligibilityservice;

@RestController
@RequestMapping("/api/v1")
public class patienteligibilitycontroller {
	@Autowired
	patienteligibilityservice service;
	@PostMapping("/add18")
	public String add4(@RequestBody patienteligibility p) {
		return service.add18(p);
	}
	@GetMapping("/getall18")
	public List<patienteligibility> getall18(){
		return service.getall18();
		
	}
	

}
