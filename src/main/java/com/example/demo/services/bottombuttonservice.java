package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.bottombutton;
import com.example.demo.repository.bottombuttonrepo;


@Service
public class bottombuttonservice {
	@Autowired
	bottombuttonrepo repo;
	public String add16(bottombutton bb) {
		repo.save(bb);
		return "successfully added";
	}
	public List<bottombutton> getall16(){
		return repo.findAll();
	}

}
