package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class midsec {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
    private Integer totalPatients;
    private String totalPatientsTitle;
    private Integer clinicalTrials;
    private String clinicalTrialsTitle;
    private Integer eligiblePatients;
    private String eligiblePatientsTitle;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getTotalPatients() {
		return totalPatients;
	}
	public void setTotalPatients(Integer totalPatients) {
		this.totalPatients = totalPatients;
	}
	public String getTotalPatientsTitle() {
		return totalPatientsTitle;
	}
	public void setTotalPatientsTitle(String totalPatientsTitle) {
		this.totalPatientsTitle = totalPatientsTitle;
	}
	public Integer getClinicalTrials() {
		return clinicalTrials;
	}
	public void setClinicalTrials(Integer clinicalTrials) {
		this.clinicalTrials = clinicalTrials;
	}
	public String getClinicalTrialsTitle() {
		return clinicalTrialsTitle;
	}
	public void setClinicalTrialsTitle(String clinicalTrialsTitle) {
		this.clinicalTrialsTitle = clinicalTrialsTitle;
	}
	public Integer getEligiblePatients() {
		return eligiblePatients;
	}
	public void setEligiblePatients(Integer eligiblePatients) {
		this.eligiblePatients = eligiblePatients;
	}
	public String getEligiblePatientsTitle() {
		return eligiblePatientsTitle;
	}
	public void setEligiblePatientsTitle(String eligiblePatientsTitle) {
		this.eligiblePatientsTitle = eligiblePatientsTitle;
	}
	public midsec() {
		super();
		// TODO Auto-generated constructor stub
	}
	public midsec(Integer id, Integer totalPatients, String totalPatientsTitle, Integer clinicalTrials,
			String clinicalTrialsTitle, Integer eligiblePatients, String eligiblePatientsTitle) {
		super();
		this.id = id;
		this.totalPatients = totalPatients;
		this.totalPatientsTitle = totalPatientsTitle;
		this.clinicalTrials = clinicalTrials;
		this.clinicalTrialsTitle = clinicalTrialsTitle;
		this.eligiblePatients = eligiblePatients;
		this.eligiblePatientsTitle = eligiblePatientsTitle;
	}

}
