package com.example.model;



import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="usr", eager=true)
@ViewScoped
public class User {
	private String name;
	private String address;
	private String gender;
	private String opt="ch";
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}



	
	
	public String getOpt() {
		return opt;
	}

	public void setOpt(String opt) {
		this.opt = opt;
	}

	public Tech getT() {
		return t;
	}

	public void setT(Tech t) {
		this.t = t;
	}

	

	
	
	private Tech t=new Tech();
	
	
	
	
	

	public User() {
		
	}
	
	
	
	public void handleEvent() {
		this.opt=opt.toUpperCase();
	}
	
	
	
}
