package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ems")
public class Ems {
	@Id
private int empId;
private String empName;
private String empMail;
private long empMobile;
private String empDesignation;
private double empSalary;
private String empAddress;

public Ems(int empId, String empName, String empMail, long empMobile, String empDesignation, double empSalary,
		String empAddress) {
	super();
	this.empId = empId;
	this.empName = empName;
	this.empMail = empMail;
	this.empMobile = empMobile;
	this.empDesignation = empDesignation;
	this.empSalary = empSalary;
	this.empAddress = empAddress;
}
public Ems() {
	super();
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public String getEmpMail() {
	return empMail;
}
public void setEmpMail(String empMail) {
	this.empMail = empMail;
}
public long getEmpMobile() {
	return empMobile;
}
public void setEmpMobile(long empMobile) {
	this.empMobile = empMobile;
}
public String getEmpDesignation() {
	return empDesignation;
}
public void setEmpDesignation(String empDesignation) {
	this.empDesignation = empDesignation;
}
public double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}
public String getEmpAddress() {
	return empAddress;
}
public void setEmpAddress(String empAddress) {
	this.empAddress = empAddress;
}
@Override
public String toString() {
	return "Ems [empId=" + empId + ", empName=" + empName + ", empMail=" + empMail + ", empMobile=" + empMobile
			+ ", empDesignation=" + empDesignation + ", empSalary=" + empSalary + ", empAddress=" + empAddress + "]";
}


}
