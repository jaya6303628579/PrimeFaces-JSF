package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cId;
	private String cName;
	private String Address;
	public Company(int cId, String cName, String address) {
		super();
		this.cId = cId;
		this.cName = cName;
		Address = address;
	}
	
	public Company(String cName, String address) {
		super();
		this.cName = cName;
		Address = address;
	}

	public Company() {
		super();
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Company [cId=" + cId + ", cName=" + cName + ", Address=" + Address + "]";
	}
	
	
}
