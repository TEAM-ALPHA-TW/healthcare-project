package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class footer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String des1;
	private String des2;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDes1() {
		return des1;
	}
	public void setDes1(String des1) {
		this.des1 = des1;
	}
	public String getDes2() {
		return des2;
	}
	public void setDes2(String des2) {
		this.des2 = des2;
	}
	public footer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public footer(Integer id, String des1, String des2) {
		super();
		this.id = id;
		this.des1 = des1;
		this.des2 = des2;
	}
	

}
