package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.sidebarmodels;
import com.example.demo.services.sidebarservices;

@RestController
@RequestMapping("/api/v1")
public class sidebarcontroller {
	@Autowired
	sidebarservices service;
	@PostMapping("/add2")
	public String add2(@RequestBody sidebarmodels s) {
		return service.add2(s);
	}
	@GetMapping("/getall3")
	public List<sidebarmodels> getall3(){
		return service.getall3();
		
	}

}
