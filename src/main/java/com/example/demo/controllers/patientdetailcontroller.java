package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.patientdetails;
import com.example.demo.services.patientdetailservice;


@RestController
@RequestMapping("/api/v1")
public class patientdetailcontroller {
	@Autowired
	patientdetailservice service;
	@PostMapping("/add13")
	public String add4(@RequestBody patientdetails p) {
		return service.add13(p);
	}
	@GetMapping("/getall13")
	public List<patientdetails> getall13(){
		return service.getall13();
		
	}

}
