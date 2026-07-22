package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.actionbutton;
import com.example.demo.services.actionbuttonservice;


@RestController
@RequestMapping("/api/v1")
public class actionbuttoncontroller {
	@Autowired
	actionbuttonservice service;
	@PostMapping("/add15")
	public String add15(@RequestBody actionbutton a) {
		return service.add15(a);
	}
	@GetMapping("/getall15")
	public List<actionbutton> getall15(){
		return service.getall15();
		
	}

}
