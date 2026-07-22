package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.actionbutton;



@Repository
public interface actionbuttonrepo extends JpaRepository<actionbutton, Integer> {

}
