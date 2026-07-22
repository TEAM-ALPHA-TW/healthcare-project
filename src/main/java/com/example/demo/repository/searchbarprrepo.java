package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.searchbarpr;

@Repository
public interface searchbarprrepo extends JpaRepository<searchbarpr, Integer> {

	

}
