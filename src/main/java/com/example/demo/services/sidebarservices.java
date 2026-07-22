package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.sidebarmodels;
import com.example.demo.repository.sidebarrepository;

@Service
public class sidebarservices {
	@Autowired
	sidebarrepository repo;
	public String add2(sidebarmodels s) {
		repo.save(s);
		return "successfully added";
	}
	public List<sidebarmodels> getall3(){
		return repo.findAll();
	}


}
