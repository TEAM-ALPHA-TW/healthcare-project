package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.models.midsec;
import com.example.demo.services.midsecservice;

@RestController
@RequestMapping("/api/v1")
public class midseccontroller {
	@Autowired
	midsecservice service;
	@PostMapping("/add6")
	public String add6(@RequestBody midsec m) {
		return service.add6(m);
	}
	@GetMapping("/getall6")
	public List<midsec> getall6(){
		return service.getall6();
		
	}

}
