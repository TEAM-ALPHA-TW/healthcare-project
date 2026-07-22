package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class bottombutton {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	 private String buttonText;
	 public Integer getId() {
		 return id;
	 }
	 public void setId(Integer id) {
		 this.id = id;
	 }
	 public String getButtonText() {
		 return buttonText;
	 }
	 public void setButtonText(String buttonText) {
		 this.buttonText = buttonText;
	 }
	 public bottombutton() {
		super();
		// TODO Auto-generated constructor stub
	 }
	 public bottombutton(Integer id, String buttonText) {
		super();
		this.id = id;
		this.buttonText = buttonText;
	 }
	 

}
