package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class sidebarmodels {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String icon1;
	private String title1;
	private String route1;
	private String icon2;
	private String title2;
	private String route2;
	private String icon3;
	private String title3;
	private String route3;
	private String icon4;
	private String title4;
	private String route4;
	private String icon5;
	private String title5;
	private String route5;
	private String icon6;
	private String title6;
	private String route6;
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
	public String getIcon4() {
		return icon4;
	}
	public void setIcon4(String icon4) {
		this.icon4 = icon4;
	}
	public String getTitle4() {
		return title4;
	}
	public void setTitle4(String title4) {
		this.title4 = title4;
	}
	public String getRoute4() {
		return route4;
	}
	public void setRoute4(String route4) {
		this.route4 = route4;
	}
	public String getIcon5() {
		return icon5;
	}
	public void setIcon5(String icon5) {
		this.icon5 = icon5;
	}
	public String getTitle5() {
		return title5;
	}
	public void setTitle5(String title5) {
		this.title5 = title5;
	}
	public String getRoute5() {
		return route5;
	}
	public void setRoute5(String route5) {
		this.route5 = route5;
	}
	public String getIcon6() {
		return icon6;
	}
	public void setIcon6(String icon6) {
		this.icon6 = icon6;
	}
	public String getTitle6() {
		return title6;
	}
	public void setTitle6(String title6) {
		this.title6 = title6;
	}
	public String getRoute6() {
		return route6;
	}
	public void setRoute6(String route6) {
		this.route6 = route6;
	}
	public sidebarmodels() {
		super();
		// TODO Auto-generated constructor stub
	}
	public sidebarmodels(Integer id, String icon1, String title1, String route1, String icon2, String title2,
			String route2, String icon3, String title3, String route3, String icon4, String title4, String route4,
			String icon5, String title5, String route5, String icon6, String title6, String route6) {
		super();
		this.id = id;
		this.icon1 = icon1;
		this.title1 = title1;
		this.route1 = route1;
		this.icon2 = icon2;
		this.title2 = title2;
		this.route2 = route2;
		this.icon3 = icon3;
		this.title3 = title3;
		this.route3 = route3;
		this.icon4 = icon4;
		this.title4 = title4;
		this.route4 = route4;
		this.icon5 = icon5;
		this.title5 = title5;
		this.route5 = route5;
		this.icon6 = icon6;
		this.title6 = title6;
		this.route6 = route6;
	}
	
	

}
