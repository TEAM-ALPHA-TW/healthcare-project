package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.patientsec;

@Repository
public interface patientsecrepo extends JpaRepository<patientsec, Integer> {

}
