package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.clinicaltrialpage;
import com.example.demo.services.clinicaltrialpageservice;


@RestController
@RequestMapping("/api/v1")
public class clinicaltrialpagecontroller {
	@Autowired
	clinicaltrialpageservice service;
	@PostMapping("/add17")
	public String add16(@RequestBody clinicaltrialpage c) {
		return service.add17(c);
	}
	@GetMapping("/getall17")
	public List<clinicaltrialpage> getall17(){
		return service.getall17();
		
	}

}
