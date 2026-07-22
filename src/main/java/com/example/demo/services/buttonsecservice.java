package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.buttonsec;
import com.example.demo.repository.buttonsecrepo;


@Service
public class buttonsecservice {
	@Autowired
	buttonsecrepo repo;
	public String add9(buttonsec b) {
		repo.save(b);
		return "successfully added";
	}
	public List<buttonsec> getall9(){
		return repo.findAll();
	}


}
