package com.example.model;

public class Tech {
	private String name;
	private String developedBy;
	private int year;
	public Tech(String name, String developedBy, int year) {
		super();
		this.name = name;
		this.developedBy = developedBy;
		this.year = year;
	}
	public Tech() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDevelopedBy() {
		return developedBy;
	}
	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Tech [name=" + name + ", developedBy=" + developedBy + ", year=" + year + "]";
	}
	

}
