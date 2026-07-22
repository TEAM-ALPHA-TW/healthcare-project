package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.models.footer;

@Repository
public interface footerrepo extends JpaRepository<footer, Integer> {

}
