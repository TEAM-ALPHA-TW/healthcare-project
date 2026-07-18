package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.patientrecords;
import com.example.demo.repository.patientrecordrepo;
@Service
public class patientrecordservice {
	@Autowired
	patientrecordrepo repo;
	public String add11(patientrecords pr) {
		repo.save(pr);
		return "successfully added";
	}
	public List<patientrecords> getall11(){
		return repo.findAll();
	}

}
