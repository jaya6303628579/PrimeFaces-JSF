package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class SchoolDao {
	EntityManagerFactory emf;
	EntityManager em;
	public SchoolDao() {
		emf=Persistence.createEntityManagerFactory("PU");
		em=emf.createEntityManager();
	}
	
	public void saveStu(School school) {
		em.getTransaction().begin();
		em.persist(school);
		em.getTransaction().commit();
		emf.close();
		em.close();
	}
	
	public School getStu(Long id) {
		return em.find(School.class, id);
	}
	
	public List<School> getAllStu(){
		TypedQuery<School> query = em.createQuery("select s from School s", School.class);
		return query.getResultList();
	}
	
	public void updateStu(School school) {
		em.getTransaction().begin();
		em.merge(school);
		em.getTransaction().commit();
		em.close();
		emf.close();
	}
	
	public void deleteStu(Long id) {
		School school=getStu(id);
		em.getTransaction().begin();
		em.remove(school);
		em.getTransaction().commit();
		
	}

}
