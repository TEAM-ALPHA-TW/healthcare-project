package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.clinicaltrialpage;
import com.example.demo.services.clinicaltrialpageservice;

@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class clinicaltrialpagecontroller {

    @Autowired
    clinicaltrialpageservice service;

    // ADD
    @PostMapping("/add17")
    public String add17(@RequestBody clinicaltrialpage c) {
        return service.add17(c);
    }

    // GET ALL
    @GetMapping("/getall17")
    public List<clinicaltrialpage> getall17() {
        return service.getall17();
    }

    // UPDATE
    @PutMapping("/update17/{id}")
    public String update17(@PathVariable Integer id,
                           @RequestBody clinicaltrialpage c) {
        return service.update17(id, c);
    }

    // DELETE
    @DeleteMapping("/delete17/{id}")
    public String delete17(@PathVariable Integer id) {
        return service.delete17(id);
    }
 // MATCH CLINICAL TRIALS
    @GetMapping("/matchtrial/{disease}/{age}")
    public List<clinicaltrialpage> matchTrial(
            @PathVariable String disease,
            @PathVariable Integer age) {

        return service.matchTrials(disease, age);
    }

}