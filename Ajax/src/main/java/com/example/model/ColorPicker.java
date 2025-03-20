package com.example.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="cp")
@ViewScoped
public class ColorPicker {
	
	private String inlineColor;
	private String popupColor;
	public String getInlineColor() {
		return inlineColor;
	}
	public void setInlineColor(String inlineColor) {
		this.inlineColor = inlineColor;
	}
	public String getPopupColor() {
		return popupColor;
	}
	public void setPopupColor(String popupColor) {
		this.popupColor = popupColor;
	}
	
}
