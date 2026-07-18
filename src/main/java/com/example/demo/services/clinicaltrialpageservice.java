package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.clinicaltrialpage;
import com.example.demo.repository.clinicaltrialpagerepo;


@Service
public class clinicaltrialpageservice {
	@Autowired
	clinicaltrialpagerepo repo;
	public String add17(clinicaltrialpage c) {
		repo.save(c);
		return "successfully added";
	}
	public List<clinicaltrialpage> getall17(){
		return repo.findAll();
	}

}
