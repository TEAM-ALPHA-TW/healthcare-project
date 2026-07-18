package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.searchbarpr;
import com.example.demo.repository.searchbarprrepo;


@Service
public class searchbarprservice {
	@Autowired
	searchbarprrepo repo;
	public String add12(searchbarpr sp) {
		repo.save(sp);
		return "successfully added";
	}
	public List<searchbarpr> getall12(){
		return repo.findAll();
	}

}
