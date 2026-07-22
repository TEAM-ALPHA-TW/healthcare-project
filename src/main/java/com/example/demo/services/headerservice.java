package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.header;
import com.example.demo.repository.headerrepository;

@Service
public class headerservice {
	@Autowired
	headerrepository repo;
	public String add5(header h) {
		repo.save(h);
		return "successfully added";
	}
	public List<header> getall5(){
		return repo.findAll();
	}

}
