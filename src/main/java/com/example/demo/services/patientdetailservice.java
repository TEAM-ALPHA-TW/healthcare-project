package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.patientdetails;
import com.example.demo.repository.patientdetailrepo;

@Service
public class patientdetailservice {
	@Autowired
	patientdetailrepo repo;
	public String add13(patientdetails p) {
		repo.save(p);
		return "successfully added";
	}
	public List<patientdetails> getall13(){
		return repo.findAll();
	}

}
