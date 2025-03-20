package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String mail;
	private String address;
	
	
	public Person() {
		super();
	}
	
	


	public Person(String name, String mail, String address) {
		super();
		this.name = name;
		this.mail = mail;
		this.address = address;
	}




	public Person(int id, String name, String mail, String address) {
		super();
		this.id = id;
		this.name = name;
		this.mail = mail;
		this.address = address;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mail=" + mail + ", address=" + address + "]";
	}
	
	
	
}
