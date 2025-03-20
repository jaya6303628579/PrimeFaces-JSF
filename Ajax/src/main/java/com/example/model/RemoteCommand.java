package com.example.model;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="rcb")
@ViewScoped
public class RemoteCommand {
	
	public void display() {

		FacesMessage message=new FacesMessage(FacesMessage.SEVERITY_INFO, "Called", "Using Remote Command...");
		FacesContext.getCurrentInstance().addMessage(null, message);
		
	}
}
