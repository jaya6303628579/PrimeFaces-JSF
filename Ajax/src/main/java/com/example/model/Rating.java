package com.example.model;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RateEvent;

@ManagedBean(name="rate")
@ViewScoped
public class Rating {
	private Integer basicRate;
	private Integer callbackRate;
	private Integer ajaxRate;
	private Integer readOnlyRating =3;
	public Integer getBasicRate() {
		return basicRate;
	}
	public void setBasicRate(Integer basicRate) {
		this.basicRate = basicRate;
	}
	public Integer getCallbackRate() {
		return callbackRate;
	}
	public void setCallbackRate(Integer callbackRate) {
		this.callbackRate = callbackRate;
	}
	public Integer getAjaxRate() {
		return ajaxRate;
	}
	public void setAjaxRate(Integer ajaxRate) {
		this.ajaxRate = ajaxRate;
	}
	public Integer getReadOnlyRating() {
		return readOnlyRating;
	}
	public void setReadOnlyRating(Integer readOnlyRating) {
		this.readOnlyRating = readOnlyRating;
	}
	
	public void onRate(RateEvent<Integer> rateEvent) {
		FacesMessage message=new  FacesMessage(FacesMessage.SEVERITY_INFO, "Rate Event", "You have rated :"+ajaxRate);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
	
	

}
