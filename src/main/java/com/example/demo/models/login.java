package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class login {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	 private String doctorName;

    private String email;

    private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public login(Integer id, String doctorName, String email, String password) {
		super();
		this.id = id;
		this.doctorName = doctorName;
		this.email = email;
		this.password = password;
	}

	

	}	