package com.prime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.SelectEvent;

@ManagedBean
@ViewScoped
public class DatePickerView {

	private Date date1;
	private Date date2;
	private Date date3;
	private Date date4;
	private Date date5;
	private Date date6;
	private Date date7;
	private Date date8;
	private Date date9;
	private Date date10;
	private Date date11;
	private Date date12;
	private Date date13;

	private Date date14;

	private Date date15;

	private Date date16;

	private List<Date> multipleDate;

	private List<Date> rangeDates;

	private List<Date> invalidDates;

	private List<Integer> invalidDays;

	private Date minDate;

	private Date maxDate;

	private List<String> months;

	private List<Integer> years;

	public DatePickerView() {

		// Initialize dates for examples

		multipleDate = new ArrayList<>();

		rangeDates = new ArrayList<>();

		invalidDates = new ArrayList<>();

		invalidDays = new ArrayList<>();

		// Current date

		Date today = new Date();

		// Set min/max dates for constraints example

		LocalDate localDate = LocalDate.now();

		minDate = java.sql.Date.valueOf(localDate.minusDays(30));

		maxDate = java.sql.Date.valueOf(localDate.plusDays(30));

		// Set some invalid dates

		LocalDate invalidLocalDate = LocalDate.now();

		invalidDates.add(java.sql.Date.valueOf(invalidLocalDate.plusDays(1)));

		invalidDates.add(java.sql.Date.valueOf(invalidLocalDate.plusDays(7)));

		invalidDates.add(java.sql.Date.valueOf(invalidLocalDate.plusDays(14)));

		// Set some invalid days (0=Sunday, 1=Monday, ..., 6=Saturday)

		invalidDays.add(0); // Sunday

		invalidDays.add(6); // Saturday

		// For navigator template example

		months = new ArrayList<>();

		months.add("January");

		months.add("February");

		months.add("March");

		months.add("April");

		months.add("May");

		months.add("June");

		months.add("July");

		months.add("August");

		months.add("September");

		months.add("October");

		months.add("November");

		months.add("December");

	}

	public void onDateSelect(SelectEvent event) {

		FacesContext facesContext = FacesContext.getCurrentInstance();

		facesContext.addMessage(null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, "Date Selected", event.getObject().toString()));

	}

	// Getters and Setters

	public Date getDate1() {

		return date1;

	}

	public void setDate1(Date date1) {

		this.date1 = date1;

	}

	public Date getDate2() {

		return date2;

	}

	public void setDate2(Date date2) {

		this.date2 = date2;

	}

	public Date getDate3() {

		return date3;

	}

	public void setDate3(Date date3) {

		this.date3 = date3;

	}

	public Date getDate4() {

		return date4;

	}

	public void setDate4(Date date4) {

		this.date4 = date4;

	}

	public Date getDate5() {

		return date5;

	}

	public void setDate5(Date date5) {

		this.date5 = date5;

	}

	public Date getDate6() {

		return date6;

	}

	public void setDate6(Date date6) {

		this.date6 = date6;

	}

	public Date getDate7() {

		return date7;

	}

	public void setDate7(Date date7) {

		this.date7 = date7;

	}

	public Date getDate8() {

		return date8;

	}

	public void setDate8(Date date8) {

		this.date8 = date8;

	}

	public Date getDate9() {

		return date9;

	}

	public void setDate9(Date date9) {

		this.date9 = date9;

	}

	public Date getDate10() {

		return date10;

	}

	public void setDate10(Date date10) {

		this.date10 = date10;

	}

	public void setDate11(Date date11) {

		this.date11 = date11;

	}

	public Date getDate12() {

		return date12;

	}

	public void setDate12(Date date12) {

		this.date12 = date12;

	}

	public Date getDate13() {

		return date13;

	}

	public void setDate13(Date date13) {

		this.date13 = date13;

	}

	public Date getDate14() {

		return date14;

	}

	public void setDate14(Date date14) {

		this.date14 = date14;

	}

	public Date getDate15() {

		return date15;

	}

	public void setDate15(Date date15) {

		this.date15 = date15;

	}

	public Date getDate16() {

		return date16;

	}

	public void setDate16(Date date16) {

		this.date16 = date16;

	}

	public List<Date> getMultipleDate() {

		return multipleDate;

	}

	public void setMultipleDate(List<Date> multipleDate) {

		this.multipleDate = multipleDate;

	}

	public List<Date> getRangeDates() {

		return rangeDates;

	}

	public void setRangeDates(List<Date> rangeDates) {

		this.rangeDates = rangeDates;

	}

	public List<Date> getInvalidDates() {

		return invalidDates;

	}

	public void setInvalidDates(List<Date> invalidDates) {

		this.invalidDates = invalidDates;

	}

	public List<Integer> getInvalidDays() {

		return invalidDays;

	}

	public void setInvalidDays(List<Integer> invalidDays) {

		this.invalidDays = invalidDays;

	}

	public Date getMinDate() {

		return minDate;

	}

	public void setMinDate(Date minDate) {

		this.minDate = minDate;

	}

	public Date getMaxDate() {

		return maxDate;

	}

	public void setMaxDate(Date maxDate) {

		this.maxDate = maxDate;

	}

	public List<String> getMonths() {

		return months;

	}

	public void setMonths(List<String> months) {

		this.months = months;

	}

	public List<Integer> getYears() {

		return years;

	}

	public void setYears(List<Integer> years) {

		this.years = years;

	}

}