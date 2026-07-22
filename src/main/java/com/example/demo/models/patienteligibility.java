package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class patienteligibility {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	 private String title;

	    private String patientIdLabel;
	    private String patientIdPlaceholder;

	    private String clinicalTrialLabel;
	    private String clinicalTrialPlaceholder;

	    private String checkButton;
	    private String generateButton;

	    private String checkRoute;
	    private String generateRoute;

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
		public String getPatientIdLabel() {
			return patientIdLabel;
		}
		public void setPatientIdLabel(String patientIdLabel) {
			this.patientIdLabel = patientIdLabel;
		}
		public String getPatientIdPlaceholder() {
			return patientIdPlaceholder;
		}
		public void setPatientIdPlaceholder(String patientIdPlaceholder) {
			this.patientIdPlaceholder = patientIdPlaceholder;
		}
		public String getClinicalTrialLabel() {
			return clinicalTrialLabel;
		}
		public void setClinicalTrialLabel(String clinicalTrialLabel) {
			this.clinicalTrialLabel = clinicalTrialLabel;
		}
		public String getClinicalTrialPlaceholder() {
			return clinicalTrialPlaceholder;
		}
		public void setClinicalTrialPlaceholder(String clinicalTrialPlaceholder) {
			this.clinicalTrialPlaceholder = clinicalTrialPlaceholder;
		}
		public String getCheckButton() {
			return checkButton;
		}
		public void setCheckButton(String checkButton) {
			this.checkButton = checkButton;
		}
		public String getGenerateButton() {
			return generateButton;
		}
		public void setGenerateButton(String generateButton) {
			this.generateButton = generateButton;
		}
		public String getCheckRoute() {
			return checkRoute;
		}
		public void setCheckRoute(String checkRoute) {
			this.checkRoute = checkRoute;
		}
		public String getGenerateRoute() {
			return generateRoute;
		}
		public void setGenerateRoute(String generateRoute) {
			this.generateRoute = generateRoute;
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
		public patienteligibility() {
			super();
			// TODO Auto-generated constructor stub
		}
		public patienteligibility(Integer id, String title, String patientIdLabel, String patientIdPlaceholder,
				String clinicalTrialLabel, String clinicalTrialPlaceholder, String checkButton, String generateButton,
				String checkRoute, String generateRoute, String backButton, String backRoute) {
			super();
			this.id = id;
			this.title = title;
			this.patientIdLabel = patientIdLabel;
			this.patientIdPlaceholder = patientIdPlaceholder;
			this.clinicalTrialLabel = clinicalTrialLabel;
			this.clinicalTrialPlaceholder = clinicalTrialPlaceholder;
			this.checkButton = checkButton;
			this.generateButton = generateButton;
			this.checkRoute = checkRoute;
			this.generateRoute = generateRoute;
			this.backButton = backButton;
			this.backRoute = backRoute;
		}
	    

}
