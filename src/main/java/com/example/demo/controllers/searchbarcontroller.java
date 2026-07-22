package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.searchbar;
import com.example.demo.services.searchbarservice;

@RestController
@RequestMapping("/api/v1")
public class searchbarcontroller {
	@Autowired
	searchbarservice service;
	@PostMapping("/add7")
	public String add7(@RequestBody searchbar s) {
		return service.add7(s);
	}
	@GetMapping("/getall7")
	public List<searchbar> getall7(){
		return service.getall7();
		
	}


}
