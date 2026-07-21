package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.eligibilityletter;
import com.example.demo.repository.eligibilityletterrepo;

@Service
public class eligibilityletterservice {
	@Autowired
	eligibilityletterrepo repo;
	public String add19(eligibilityletter e) {
		repo.save(e);
		return "successfully added";
	}
	public List<eligibilityletter> getall19(){
		return repo.findAll();
	}
	public eligibilityletter getLetter(String patientId) {

	    List<eligibilityletter> letters = repo.findAll();

	    for (eligibilityletter e : letters) {

	        if (e.getPatientId().equalsIgnoreCase(patientId)) {

	            return e;

	        }

	    }

	    return null;
	}

}
