package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.patienttable;
import com.example.demo.repository.patienttablerepo;


@Service
public class patienttableservice {
	@Autowired
	patienttablerepo repo;
	public String add14(patienttable pt) {
		repo.save(pt);
		return "successfully added";
	}
	public List<patienttable> getall14(){
		return repo.findAll();
	}
	public String delete14(Integer id) {

        repo.deleteById(id);

        return "deleted successfully";
    }
	public String update14(Integer id, patienttable pt) {

	    patienttable patient = repo.findById(id).orElse(null);

	    if (patient != null) {

	        patient.setPatientId(pt.getPatientId());
	        patient.setPatientName(pt.getPatientName());
	        patient.setAge(pt.getAge());
	        patient.setGender(pt.getGender());
	        patient.setDisease(pt.getDisease());
	        patient.setBloodGroup(pt.getBloodGroup());
	        patient.setPhone(pt.getPhone());

	        repo.save(patient);

	        return "Updated Successfully";
	    }

	    return "Patient Not Found";
	}


}
