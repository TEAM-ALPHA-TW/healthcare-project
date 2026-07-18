package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class buttonsec {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String icon1;
	private String button1;
	private String route1;

	private String icon2;
	private String button2;
	private String route2;

	private String icon3;
	private String button3;
	private String route3;
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
	public String getButton1() {
		return button1;
	}
	public void setButton1(String button1) {
		this.button1 = button1;
	}
	public String getRoute1() {
		return route1;
	}
	public void setRoute1(String route1) {
		this.route1 = route1;
	}
	public String getIcon2() {
		return icon2;
	}
	public void setIcon2(String icon2) {
		this.icon2 = icon2;
	}
	public String getButton2() {
		return button2;
	}
	public void setButton2(String button2) {
		this.button2 = button2;
	}
	public String getRoute2() {
		return route2;
	}
	public void setRoute2(String route2) {
		this.route2 = route2;
	}
	public String getIcon3() {
		return icon3;
	}
	public void setIcon3(String icon3) {
		this.icon3 = icon3;
	}
	public String getButton3() {
		return button3;
	}
	public void setButton3(String button3) {
		this.button3 = button3;
	}
	public String getRoute3() {
		return route3;
	}
	public void setRoute3(String route3) {
		this.route3 = route3;
	}
	public buttonsec() {
		super();
		// TODO Auto-generated constructor stub
	}
	public buttonsec(Integer id, String icon1, String button1, String route1, String icon2, String button2,
			String route2, String icon3, String button3, String route3) {
		super();
		this.id = id;
		this.icon1 = icon1;
		this.button1 = button1;
		this.route1 = route1;
		this.icon2 = icon2;
		this.button2 = button2;
		this.route2 = route2;
		this.icon3 = icon3;
		this.button3 = button3;
		this.route3 = route3;
	}
	

}
