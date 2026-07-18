package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class clinicaltrialpage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;

    private String diseaseLabel;
    private String diseasePlaceholder;

    private String ageLabel;
    private String agePlaceholder;

    private String searchButton;

    private String trialId;
    private String trialName;
    private String disease;
    private String location;
    private String status;

    private String actionButton;
    private String actionRoute;

    private String backButton;
    private String backRoute;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDiseaseLabel() {
		return diseaseLabel;
	}
	public void setDiseaseLabel(String diseaseLabel) {
		this.diseaseLabel = diseaseLabel;
	}
	public String getDiseasePlaceholder() {
		return diseasePlaceholder;
	}
	public void setDiseasePlaceholder(String diseasePlaceholder) {
		this.diseasePlaceholder = diseasePlaceholder;
	}
	public String getAgeLabel() {
		return ageLabel;
	}
	public void setAgeLabel(String ageLabel) {
		this.ageLabel = ageLabel;
	}
	public String getAgePlaceholder() {
		return agePlaceholder;
	}
	public void setAgePlaceholder(String agePlaceholder) {
		this.agePlaceholder = agePlaceholder;
	}
	public String getSearchButton() {
		return searchButton;
	}
	public void setSearchButton(String searchButton) {
		this.searchButton = searchButton;
	}
	public String getTrialId() {
		return trialId;
	}
	public void setTrialId(String trialId) {
		this.trialId = trialId;
	}
	public String getTrialName() {
		return trialName;
	}
	public void setTrialName(String trialName) {
		this.trialName = trialName;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getActionButton() {
		return actionButton;
	}
	public void setActionButton(String actionButton) {
		this.actionButton = actionButton;
	}
	public String getActionRoute() {
		return actionRoute;
	}
	public void setActionRoute(String actionRoute) {
		this.actionRoute = actionRoute;
	}
	public String getBackButton() {
		return backButton;
	}
	public void setBackButton(String backButton) {
		this.backButton = backButton;
	}
	public String getBackRoute() {
		return backRoute;
	}
	public void setBackRoute(String backRoute) {
		this.backRoute = backRoute;
	}
	public clinicaltrialpage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public clinicaltrialpage(Integer id, String title, String diseaseLabel, String diseasePlaceholder, String ageLabel,
			String agePlaceholder, String searchButton, String trialId, String trialName, String disease,
			String location, String status, String actionButton, String actionRoute, String backButton,
			String backRoute) {
		super();
		this.id = id;
		this.title = title;
		this.diseaseLabel = diseaseLabel;
		this.diseasePlaceholder = diseasePlaceholder;
		this.ageLabel = ageLabel;
		this.agePlaceholder = agePlaceholder;
		this.searchButton = searchButton;
		this.trialId = trialId;
		this.trialName = trialName;
		this.disease = disease;
		this.location = location;
		this.status = status;
		this.actionButton = actionButton;
		this.actionRoute = actionRoute;
		this.backButton = backButton;
		this.backRoute = backRoute;
	}
    

}
