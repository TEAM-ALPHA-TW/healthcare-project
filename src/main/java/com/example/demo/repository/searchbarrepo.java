package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.searchbar;

@Repository
public interface searchbarrepo extends JpaRepository<searchbar, Integer> {



}
