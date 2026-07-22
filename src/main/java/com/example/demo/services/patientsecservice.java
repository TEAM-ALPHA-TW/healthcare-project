package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.patientsec;
import com.example.demo.repository.patientsecrepo;

@Service
public class patientsecservice {
	@Autowired
	patientsecrepo repo;
	public String add8(patientsec p) {
		repo.save(p);
		return "successfully added";
	}
	public List<patientsec> getall8(){
		return repo.findAll();
	}

}
