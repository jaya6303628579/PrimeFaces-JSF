package com.prime;

import java.time.LocalDateTime;

import javax.faces.bean.ManagedBean;
@ManagedBean(name = "clockView")
public class ClockView {
	 private LocalDateTime dateTime;

	    
	    public ClockView() {
	        dateTime = LocalDateTime.now().plusYears(37).plusMonths(3).plusHours(4);
	    }

	    public LocalDateTime getDateTime() {
	        return dateTime;
	    }

	    public void setDateTime(LocalDateTime dateTime) {
	        this.dateTime = dateTime;
	    }
	
}
