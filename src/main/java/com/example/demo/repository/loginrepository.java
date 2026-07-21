package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.login;

@Repository
public interface loginrepository extends JpaRepository<login, Integer> {

    login findByEmailAndPassword(String email, String password);

}


