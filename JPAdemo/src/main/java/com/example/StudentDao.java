package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class StudentDao {
	EntityManagerFactory emf;
	EntityManager em;
	public StudentDao() {
		emf=Persistence.createEntityManagerFactory("PU");
		em=emf.createEntityManager();
	}
	
	public void saveStu(Student student) {
		em.getTransaction().begin();
		em.persist(student);
		em.getTransaction().commit();
		emf.close();
		em.close();
	}
	
	public Student getStu(Long id) {
		return em.find(Student.class, id);
	}
	
	public List<Student> getAllStu(){
		TypedQuery<Student> query = em.createQuery("select s from Student s", Student.class);
		return query.getResultList();
	}
	
	public void updateStu(Student student) {
		em.getTransaction().begin();
		em.merge(student);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
	public void deleteStu(Long id) {
		Student student=getStu(id);
		em.getTransaction().begin();
		em.remove(student);
		em.getTransaction().commit();
		
	}
}
