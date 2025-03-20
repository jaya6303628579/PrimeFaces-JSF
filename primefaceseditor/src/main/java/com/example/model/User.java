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

	public List<Tech> getTechList() {
		return techList;
	}

	public void setTechList(List<Tech> techList) {
		this.techList = techList;
	}

	private String opt="ch";
	
	private Tech t=new Tech();
	private List<Tech> techList;
	
	
	
	

	public User() {
		techList=new ArrayList<>();
		techList.add(new Tech("Java", "james gosling", 1995));
		techList.add(new Tech("Python", "guido van ressum", 1991));
		techList.add(new Tech("c", "dennis richie", 1972));
		techList.add(new Tech("c++", "bejarne stroustrup", 1985));
		techList.add(new Tech("JSF", "TECKEF", 1995));
		techList.add(new Tech(".net", "james gosling", 1995));
	}
	
	public void confirm() {
		addMessage("DELETE RECORD", "YOUR RECORD HAS BEEN DELETED");
	}
	

	
	
	public void displayMessage() {
		FacesContext context=FacesContext.getCurrentInstance();
		context.addMessage(null, new FacesMessage("Login sucessful", "welcome :"+opt));
		
	}
	
	public void addMessage(String Summary, String detail) {
		
		FacesMessage message=new FacesMessage(FacesMessage.SEVERITY_INFO, Summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
		
	}
	
	public void handleEvent() {
		this.opt=opt.toUpperCase();
	}
	
	
	
}
