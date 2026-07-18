package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.sidebarmodels;

@Repository
public interface sidebarrepository extends JpaRepository<sidebarmodels, Integer> {

}
