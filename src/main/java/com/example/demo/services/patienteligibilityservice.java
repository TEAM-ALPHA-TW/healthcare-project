package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.eligibilityletter;
import com.example.demo.models.patienteligibility;
import com.example.demo.repository.eligibilityletterrepo;
import com.example.demo.repository.patienteligibilityrepo;
@Service
public class patienteligibilityservice {
	@Autowired
	patienteligibilityrepo repo;
	@Autowired
	eligibilityletterrepo letterRepo;
	public String add18(patienteligibility p) {
		repo.save(p);
		return "successfully added";
	}
	public List<patienteligibility> getall18(){
		return repo.findAll();
	}
	public String checkEligibility(String patientId, String trialName) {

	    for (eligibilityletter e : letterRepo.findAll()) {

	        if (e.getPatientId().equalsIgnoreCase(patientId)
	                && e.getClinicalTrial().equalsIgnoreCase(trialName)
	                && e.getStatus().equalsIgnoreCase("Eligible")) {

	            return "Patient is Eligible for Clinical Trial";
	        }

	    }

	    return "Patient is Not Eligible";
	}

}
