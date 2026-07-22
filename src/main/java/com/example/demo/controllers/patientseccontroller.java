package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.patientsec;
import com.example.demo.services.patientsecservice;

@RestController
@RequestMapping("/api/v1")

public class patientseccontroller {
	@Autowired
	patientsecservice service;
	@PostMapping("/add8")
	public String add8(@RequestBody patientsec p) {
		return service.add8(p);
	}
	@GetMapping("/getall8")
	public List<patientsec> getall8(){
		return service.getall8();
		
	}

}
