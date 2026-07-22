package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class actionbutton {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String viewText;
    private String editText;
    private String deleteText;
    private String viewRoute;
    private String editRoute;
    private String deleteRoute;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getViewText() {
		return viewText;
	}
	public void setViewText(String viewText) {
		this.viewText = viewText;
	}
	public String getEditText() {
		return editText;
	}
	public void setEditText(String editText) {
		this.editText = editText;
	}
	public String getDeleteText() {
		return deleteText;
	}
	public void setDeleteText(String deleteText) {
		this.deleteText = deleteText;
	}
	public String getViewRoute() {
		return viewRoute;
	}
	public void setViewRoute(String viewRoute) {
		this.viewRoute = viewRoute;
	}
	public String getEditRoute() {
		return editRoute;
	}
	public void setEditRoute(String editRoute) {
		this.editRoute = editRoute;
	}
	public String getDeleteRoute() {
		return deleteRoute;
	}
	public void setDeleteRoute(String deleteRoute) {
		this.deleteRoute = deleteRoute;
	}
	public actionbutton() {
		super();
		// TODO Auto-generated constructor stub
	}
	public actionbutton(Integer id, String viewText, String editText, String deleteText, String viewRoute,
			String editRoute, String deleteRoute) {
		super();
		this.id = id;
		this.viewText = viewText;
		this.editText = editText;
		this.deleteText = deleteText;
		this.viewRoute = viewRoute;
		this.editRoute = editRoute;
		this.deleteRoute = deleteRoute;
	}
    


}
