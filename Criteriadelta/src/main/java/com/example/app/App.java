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
	        	/**
	        	List<Person> getAll=personService.getAllPersons();
	        	getAll.forEach(System.out::println);
	        	**/
	        	Person p=personService.getOne(1);
	        	System.out.println(p);
	        }
	        finally {
	            weld.shutdown();
	        }
		
	}

}
