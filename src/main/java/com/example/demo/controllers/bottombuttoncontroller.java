package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.bottombutton;
import com.example.demo.services.bottombuttonservice;

@RestController
@RequestMapping("/api/v1")
public class bottombuttoncontroller {
	@Autowired
	bottombuttonservice service;
	@PostMapping("/add16")
	public String add16(@RequestBody bottombutton bb) {
		return service.add16(bb);
	}
	@GetMapping("/getall16")
	public List<bottombutton> getall16(){
		return service.getall16();
		
	}

}
