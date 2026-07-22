package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.buttonsec;
import com.example.demo.services.buttonsecservice;


@RestController
@RequestMapping("/api/v1")
public class buttonseccontroller {
	@Autowired
	buttonsecservice service;
	@PostMapping("/add9")
	public String add5(@RequestBody buttonsec b) {
		return service.add9(b);
	}
	@GetMapping("/getall9")
	public List<buttonsec> getall9(){
		return service.getall9();
		
	}

}
