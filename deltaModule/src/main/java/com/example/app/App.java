package com.example.app;

import java.util.List;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import com.example.model.Person;
import com.example.service.PersonService;

public class App {
	
	
	public static void main(String[] args) {
		 Weld weld = new Weld();
	        WeldContainer container = weld.initialize();
	        try {
	        	PersonService personService=container.select(PersonService.class).get();
	        	
	        	/***  
	        	 * CREATING THE DATA RECORD
	        	 * 
	        	Person p=new Person("naresh", "naresh@gmail.com", "HYD");
	        	personService.createPerson(p);
	        	System.out.println("success");
	        	**/
	        	/*** RETRIVING THE All DATA
	        	List<Person> getAll=personService.getAllPersons();
	        	getAll.forEach(System.out::println);
	        	
	        	***/
	        /** UPDATING THE RECORD
	        	Person p=new Person(3,"AVINASH" , "avi@gmail.com", "HYD");
	        	personService.updatePerson(p);**/
	        	
	        	/**
	        	List<Person> getAll=personService.getAllPersons();
	        	getAll.forEach(System.out::println);
	        	**/
	        	/**
	        	 * DELETING THE RECORD
	        	 * 
	        	personService.deletePerson(3);
	        	
	        	**/
	        	/**
	        	 * RETRIVING A SINGLE DATA 
	        	 * 
	        	Person p=personService.getById(2);
	        	System.out.println(p);
	        	**/
	        	
	        	/**
	        	List<Person> findbyname=personService.getByName("naresh");
	        	findbyname.forEach(System.out::println);
	        	**/
	        	
	        	/**
	        	List<Person> findbyaddress=personService.getByAddress("HYD");
	        	findbyaddress.forEach(System.out::println);
	        	**/
	        }
	        finally {
	            weld.shutdown();
	        }
		
	}

}
