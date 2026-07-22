package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.patienteligibility;
@Repository
public interface patienteligibilityrepo extends JpaRepository<patienteligibility, Integer> {

	

}
