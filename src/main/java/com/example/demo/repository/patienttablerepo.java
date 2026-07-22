package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.patienttable;

@Repository
public interface patienttablerepo extends JpaRepository<patienttable, Integer> {


}
