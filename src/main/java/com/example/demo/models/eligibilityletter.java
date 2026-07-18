package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class eligibilityletter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String patientName;
    private String patientId;
    private String disease;
    private String clinicalTrial;
    private String status;
    private String button1;
    private String button2;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatientId() {
		return patientId;
	}
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}
	public String getDisease() {
		return disease;
	}
	public void setDisease(String disease) {
		this.disease = disease;
	}
	public String getClinicalTrial() {
		return clinicalTrial;
	}
	public void setClinicalTrial(String clinicalTrial) {
		this.clinicalTrial = clinicalTrial;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getButton1() {
		return button1;
	}
	public void setButton1(String button1) {
		this.button1 = button1;
	}
	public String getButton2() {
		return button2;
	}
	public void setButton2(String button2) {
		this.button2 = button2;
	}
	public eligibilityletter() {
		super();
		// TODO Auto-generated constructor stub
	}
	public eligibilityletter(Integer id, String patientName, String patientId, String disease, String clinicalTrial,
			String status, String button1, String button2) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.patientId = patientId;
		this.disease = disease;
		this.clinicalTrial = clinicalTrial;
		this.status = status;
		this.button1 = button1;
		this.button2 = button2;
	}
    


}
