package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class searchbarpr {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String title;
	 private String icon;
	 private String button;
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
	 public String getIcon() {
		 return icon;
	 }
	 public void setIcon(String icon) {
		 this.icon = icon;
	 }
	 public String getButton() {
		 return button;
	 }
	 public void setButton(String button) {
		 this.button = button;
	 }
	 public searchbarpr() {
		super();
		// TODO Auto-generated constructor stub
	 }
	 public searchbarpr(Integer id, String title, String icon, String button) {
		super();
		this.id = id;
		this.title = title;
		this.icon = icon;
		this.button = button;
	 }
	 
	

}
