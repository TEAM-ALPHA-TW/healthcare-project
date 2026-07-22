package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.actionbutton;
import com.example.demo.repository.actionbuttonrepo;


@Service
public class actionbuttonservice {
	@Autowired
	actionbuttonrepo repo;
	public String add15(actionbutton a) {
		repo.save(a);
		return "successfully added";
	}
	public List<actionbutton> getall15(){
		return repo.findAll();
	}

}
