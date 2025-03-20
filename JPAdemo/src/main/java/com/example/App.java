package com.example;

import java.util.List;
import java.util.Scanner;

public class App {
	
public static void main(String[] args) {
	//StudentDao studentDao=new StudentDao();
	 SchoolDao schoolDao=new SchoolDao();
	
	 School school=new School();
	 
	 /**applied one to many relation ship between the school and student
	 school.setName("LITTLE ANGELS");
	 Student student1=new Student();
	 Student student2=new Student();
	 student1.setName("JAYAKRISHNA");
	 student1.setEmail("jayavelpula2000@gmial.com");
	 student2.setName("JHANU");
	 student2.setEmail("JHANU@gmail.com");
	 school.getStudents().add(student2);
	 schoolDao.saveStu(school);
	 **/
	 
	 /**
	  * applied one to one relation ship betwwen the school and student
	school.setName("LITTLE ANGELS");
	 
	Student student=new Student();
	student.setName("MAHARSHI");
	student.setEmail("maharshi@gmail.com");
	school.setStudent(student);
	
	schoolDao.saveStu(school);**/
	/**
	 * ADDING THE DATA IN DATA BASE USING JPA
	student.setName("RAMYA");
	student.setEmail("ramya@gmail.com");
	studentDao.saveStu(student);
	**/
	
	/**
	 * GETTING THE ONE RECORD FROM DATABASE USING JPA
	student.setId(6L);
	student=studentDao.getStu(student.getId());
	System.out.println(student);**/
	
	
	/**
	 * GETTING ALL STUDENT DATA RECORD FROM THE DATABASE USING JPQL(JAVA PERSITANCE QUERY LANAGUAGE)
	List<Student> getAll=studentDao.getAllStu();
	getAll.forEach(System.out::println);
	
	**/
	
	/** UPDATING THE RECORD IN DATABASE USING THE JPA
	student.setId(2L);
	student=studentDao.getStu(student.getId());
	if(student!=null) {
		student.setName("JAYA KRISHNA");
		studentDao.updateStu(student);
	} **/
	 
	 
	
	/** DELETING THE RECORD IN DATABASE USING THE JPA
	studentDao.deleteStu(6L);
	List<Student> getAll=studentDao.getAllStu();
	getAll.forEach(System.out::println);
	**/
	 school.setName("LITTLE ANGELS");
	 Student student1=new Student();
	 Student student2=new Student();
	 student1.setName("govind");
	 student1.setEmail("peru2000@gmial.com");
	 student2.setName("gorak");
	 student2.setEmail("GANA@gmail.com");
	 school.getStudents().add(student1);
	 school.getStudents().add(student2);
	 schoolDao.saveStu(school);
	 
	
}

}
