package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.header;
import com.example.demo.services.headerservice;


@RestController
@RequestMapping("/api/v1")
public class headercontroller {
	@Autowired
	headerservice service;
	@PostMapping("/add5")
	public String add5(@RequestBody header h) {
		return service.add5(h);
	}
	@GetMapping("/getall5")
	public List<header> getall5(){
		return service.getall5();
		
	}

}
