package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.login;
import com.example.demo.repository.loginrepository;

@Service
public class loginservice {

    @Autowired
    loginrepository repo;

    // Login
    public login login1(login l) {
        return repo.findByEmailAndPassword(
                l.getEmail(),
                l.getPassword()
        );
    }

    public List<login> getall2() {
        return repo.findAll();
    }

}