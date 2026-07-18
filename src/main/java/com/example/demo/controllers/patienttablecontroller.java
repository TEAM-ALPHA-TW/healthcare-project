package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.patienttable;
import com.example.demo.services.patienttableservice;


@RestController
@RequestMapping("/api/v1")
public class patienttablecontroller {
	@Autowired
	patienttableservice service;
	@PostMapping("/add14")
	public String add8(@RequestBody patienttable pt) {
		return service.add14(pt);
	}
	@GetMapping("/getall14")
	public List<patienttable> getall14(){
		return service.getall14();
		
	}

}
