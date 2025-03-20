package com.example.model;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name="ts")
@ViewScoped
public class ToggleSwitch {
	
	private boolean status;

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void display() {
		
		String action=status?"Activated":"Not Activated";
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(action));
	}

}
