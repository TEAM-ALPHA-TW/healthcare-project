package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.clinicaltrialpage;
import com.example.demo.repository.clinicaltrialpagerepo;

@Service
public class clinicaltrialpageservice {

    @Autowired
    clinicaltrialpagerepo repo;

    // ADD
    public String add17(clinicaltrialpage c) {

        repo.save(c);

        return "Successfully Added";
    }

    // GET ALL
    public List<clinicaltrialpage> getall17() {

        return repo.findAll();
    }

    // DELETE
    public String delete17(Integer id) {

        repo.deleteById(id);

        return "Deleted Successfully";
    }

    // UPDATE
    public String update17(Integer id, clinicaltrialpage c) {

        clinicaltrialpage trial = repo.findById(id).orElse(null);

        if (trial != null) {

            trial.setTitle(c.getTitle());
            trial.setDiseaseLabel(c.getDiseaseLabel());
            trial.setDiseasePlaceholder(c.getDiseasePlaceholder());
            trial.setAgeLabel(c.getAgeLabel());
            trial.setAgePlaceholder(c.getAgePlaceholder());
            trial.setSearchButton(c.getSearchButton());

            trial.setTrialId(c.getTrialId());
            trial.setTrialName(c.getTrialName());
            trial.setDisease(c.getDisease());
            trial.setLocation(c.getLocation());
            trial.setStatus(c.getStatus());

            trial.setMinAge(c.getMinAge());
            trial.setMaxAge(c.getMaxAge());

            trial.setActionButton(c.getActionButton());
            trial.setActionRoute(c.getActionRoute());
            trial.setBackButton(c.getBackButton());
            trial.setBackRoute(c.getBackRoute());

            repo.save(trial);

            return "Updated Successfully";
        }

        return "Trial Not Found";
    }
 // MATCH TRIALS
    public List<clinicaltrialpage> matchTrials(String disease, Integer age) {

        List<clinicaltrialpage> trials = repo.findAll();

        return trials.stream()
                .filter(t ->
                t.getDisease().trim().equalsIgnoreCase(disease.trim())
                    &&
                    age >= t.getMinAge()
                    &&
                    age <= t.getMaxAge()
                )
                .toList();
    }

}