package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.patienttable;
import com.example.demo.repository.patienttablerepo;


@Service
public class patienttableservice {
	@Autowired
	patienttablerepo repo;
	public String add14(patienttable pt) {
		repo.save(pt);
		return "successfully added";
	}
	public List<patienttable> getall14(){
		return repo.findAll();
	}

}
