package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.navbar;
import com.example.demo.services.navbarservice;


@RestController
@RequestMapping("/api/v1")
public class navbarcontroller {
	@Autowired
	navbarservice service;
	@PostMapping("/add3")
	public String add4(@RequestBody navbar n) {
		return service.add3(n);
	}
	@GetMapping("/getall4")
	public List<navbar> getall4(){
		return service.getall4();
		
	}

}
