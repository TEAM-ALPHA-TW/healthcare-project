package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.footer;
import com.example.demo.repository.footerrepo;


@Service
public class footerservice {
	@Autowired
	footerrepo repo;
	public String add10(footer f) {
		repo.save(f);
		return "successfully added";
	}
	public List<footer> getall10(){
		return repo.findAll();
	}

}
