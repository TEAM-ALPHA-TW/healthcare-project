package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.clinicaltrialpage;


@Repository
public interface clinicaltrialpagerepo extends JpaRepository<clinicaltrialpage, Integer> {

}
