package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.eligibilityletter;
import com.example.demo.services.eligibilityletterservice;


@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins="http://localhost:4200")
public class eligibilitylettercontroller {
	@Autowired
    eligibilityletterservice service;
	@PostMapping("/add19")
	public String add19(@RequestBody eligibilityletter e) {
		return service.add19(e);
	}
	@GetMapping("/getall19")
	public List<eligibilityletter> getall19(){
		return service.getall19();
	}
	@GetMapping("/letter/{patientId}")
		public eligibilityletter getLetter(@PathVariable String patientId){

		    return service.getLetter(patientId);

		
	}


}
