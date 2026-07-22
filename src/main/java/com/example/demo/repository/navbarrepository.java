package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.navbar;


@Repository
public interface navbarrepository extends JpaRepository<navbar, Integer> {


}
