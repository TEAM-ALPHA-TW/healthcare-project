package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class patientsec {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	 private String icon1;
	 private String title1;
	 private String description1;

	 private String icon2;
	 private String title2;
	 private String description2;

	 private String icon3;
	 private String title3;
	 private String description3;
	 public Integer getId() {
		 return id;
	 }
	 public void setId(Integer id) {
		 this.id = id;
	 }
	 public String getIcon1() {
		 return icon1;
	 }
	 public void setIcon1(String icon1) {
		 this.icon1 = icon1;
	 }
	 public String getTitle1() {
		 return title1;
	 }
	 public void setTitle1(String title1) {
		 this.title1 = title1;
	 }
	 public String getDescription1() {
		 return description1;
	 }
	 public void setDescription1(String description1) {
		 this.description1 = description1;
	 }
	 public String getIcon2() {
		 return icon2;
	 }
	 public void setIcon2(String icon2) {
		 this.icon2 = icon2;
	 }
	 public String getTitle2() {
		 return title2;
	 }
	 public void setTitle2(String title2) {
		 this.title2 = title2;
	 }
	 public String getDescription2() {
		 return description2;
	 }
	 public void setDescription2(String description2) {
		 this.description2 = description2;
	 }
	 public String getIcon3() {
		 return icon3;
	 }
	 public void setIcon3(String icon3) {
		 this.icon3 = icon3;
	 }
	 public String getTitle3() {
		 return title3;
	 }
	 public void setTitle3(String title3) {
		 this.title3 = title3;
	 }
	 public String getDescription3() {
		 return description3;
	 }
	 public void setDescription3(String description3) {
		 this.description3 = description3;
	 }
	 public patientsec() {
		super();
		// TODO Auto-generated constructor stub
	 }
	 public patientsec(Integer id, String icon1, String title1, String description1, String icon2, String title2,
			String description2, String icon3, String title3, String description3) {
		super();
		this.id = id;
		this.icon1 = icon1;
		this.title1 = title1;
		this.description1 = description1;
		this.icon2 = icon2;
		this.title2 = title2;
		this.description2 = description2;
		this.icon3 = icon3;
		this.title3 = title3;
		this.description3 = description3;
	 }

}
