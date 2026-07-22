package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.models.searchbarpr;

import com.example.demo.services.searchbarprservice;

@RestController
@RequestMapping("/api/v1")
public class searchbarprcontroller {
	@Autowired
	searchbarprservice service;
	@PostMapping("/add12")
	public String add12(@RequestBody searchbarpr sp) {
		return service.add12(sp);
	}
	@GetMapping("/getall12")
	public List<searchbarpr> getall12(){
		return service.getall12();
		
	}

}
