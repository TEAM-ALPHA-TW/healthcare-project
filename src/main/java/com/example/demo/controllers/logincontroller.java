package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.login;
import com.example.demo.services.loginservice;


@RestController
@RequestMapping("/api/v1")
public class logincontroller {
	@Autowired
	loginservice service;
	@PostMapping("/add1")
	public String add1(@RequestBody login l) {
		return service.add1(l);
	}
	@GetMapping("/getall2")
	public List<login> getall2(){
		return service.getall2();
		
	}
	
}
