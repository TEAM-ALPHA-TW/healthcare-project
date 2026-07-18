package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.searchbar;
import com.example.demo.repository.searchbarrepo;

@Service
public class searchbarservice {
	@Autowired
	searchbarrepo repo;
	public String add7(searchbar s) {
		repo.save(s);
		return "successfully added";
	}
	public List<searchbar> getall7(){
		return repo.findAll();
	}

}
