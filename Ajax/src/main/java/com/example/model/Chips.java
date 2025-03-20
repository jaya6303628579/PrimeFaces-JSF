package com.example.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Chips {
	private List<String> courses;

	
	public Chips() {

		courses = new ArrayList<>(Arrays.asList("JSF", "JAVA", "PRIMEFACES", "SPRINGBOOT"));

	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

}