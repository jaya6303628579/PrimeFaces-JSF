package com.example.model;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.PrimeFaces;

@ManagedBean
@ViewScoped
public class DatePicker {
	private Date selectedDate;

    public Date getSelectedDate() {
        return selectedDate;
    }

    public void setSelectedDate(Date selectedDate) {
        this.selectedDate = selectedDate;
    }


    public void showSelectedDate() {
        if (selectedDate != null) {
            String message = "Selected Date: " + selectedDate;
            PrimeFaces.current().executeScript("PF('growl').show([{summary: 'Date Selected', detail: '" + message + "', severity: 'info'}]);");
        }
    }

}
