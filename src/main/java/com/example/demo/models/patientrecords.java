package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class patientrecords {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String icon;
    private String title;
    private String button1;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getButton1() {
		return button1;
	}
	public void setButton1(String button1) {
		this.button1 = button1;
	}
	public patientrecords() {
		super();
		// TODO Auto-generated constructor stub
	}
	public patientrecords(Integer id, String icon, String title, String button1) {
		super();
		this.id = id;
		this.icon = icon;
		this.title = title;
		this.button1 = button1;
	}
	

}
