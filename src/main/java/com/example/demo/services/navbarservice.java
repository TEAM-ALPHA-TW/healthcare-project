package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.navbar;
import com.example.demo.repository.navbarrepository;

@Service
public class navbarservice {
	@Autowired
	navbarrepository repo;
	public String add3(navbar n) {
		repo.save(n);
		return "successfully added";
	}
	public List<navbar> getall4(){
		return repo.findAll();
	}

}
