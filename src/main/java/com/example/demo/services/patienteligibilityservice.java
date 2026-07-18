package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.patienteligibility;
import com.example.demo.repository.patienteligibilityrepo;
@Service
public class patienteligibilityservice {
	@Autowired
	patienteligibilityrepo repo;
	public String add18(patienteligibility p) {
		repo.save(p);
		return "successfully added";
	}
	public List<patienteligibility> getall18(){
		return repo.findAll();
	}

}
