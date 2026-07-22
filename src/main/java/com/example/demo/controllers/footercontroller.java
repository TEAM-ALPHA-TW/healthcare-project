package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.footer;
import com.example.demo.services.footerservice;


@RestController
@RequestMapping("/api/v1")
public class footercontroller {
	@Autowired
	footerservice service;
	@PostMapping("/add10")
	public String add10(@RequestBody footer f) {
		return service.add10(f);
	}
	@GetMapping("/getall10")
	public List<footer> getall10(){
		return service.getall10();
		
	}

}
