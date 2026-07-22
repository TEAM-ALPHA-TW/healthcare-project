package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class navbar {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String logo;
	private String title;
	private String des1;
	private String icon1;
	private String title1;
	private String route1;
	private String icon2;
	private String title2;
	private String route2;
	private String icon3;
	private String title3;
	private String route3;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDes1() {
		return des1;
	}
	public void setDes1(String des1) {
		this.des1 = des1;
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
	public String getTitle2() {
		return title2;
	}
	public void setTitle2(String title2) {
		this.title2 = title2;
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
	public String getTitle3() {
		return title3;
	}
	public void setTitle3(String title3) {
		this.title3 = title3;
	}
	public String getRoute3() {
		return route3;
	}
	public void setRoute3(String route3) {
		this.route3 = route3;
	}
	public navbar() {
		super();
		// TODO Auto-generated constructor stub
	}
	public navbar(Integer id, String logo, String title, String des1, String icon1, String title1, String route1,
			String icon2, String title2, String route2, String icon3, String title3, String route3) {
		super();
		this.id = id;
		this.logo = logo;
		this.title = title;
		this.des1 = des1;
		this.icon1 = icon1;
		this.title1 = title1;
		this.route1 = route1;
		this.icon2 = icon2;
		this.title2 = title2;
		this.route2 = route2;
		this.icon3 = icon3;
		this.title3 = title3;
		this.route3 = route3;
	}
	
	
	
}
