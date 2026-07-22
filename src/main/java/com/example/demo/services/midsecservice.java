package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.models.midsec;
import com.example.demo.repository.midsecrepo;

@Service
public class midsecservice {
	@Autowired
	midsecrepo repo;
	public String add6(midsec m) {
		repo.save(m);
		return "successfully added";
	}
	public List<midsec> getall6(){
		return repo.findAll();
	}
}
