package com.example.service;

import com.example.model.Person;
import com.example.repository.EntityManagerProducer;
import com.example.repository.PersonRepository;

import org.apache.deltaspike.jpa.api.transaction.Transactional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import java.util.List;

@ApplicationScoped
public class PersonService {
    
	EntityManagerProducer entityManagerProducer =new EntityManagerProducer(); 
	EntityManager em;
    @Inject
    private PersonRepository personRepository;

	public PersonService() {
		this.em=entityManagerProducer.createEntityManager();
	}
	
   
    @Transactional
    public Person createPerson(Person user) {
    	
        return personRepository.save(user);
    }

  
    public List<Person> getAllPersons() {
    	CriteriaBuilder cb=em.getCriteriaBuilder();
    	CriteriaQuery<Person> query=cb.createQuery(Person.class);
    	Root<Person> root=query.from(Person.class);
    	query.select(root);
        return em.createQuery(query).getResultList();
    }
    
    public Person getOne(int id) {
		CriteriaBuilder cb=em.getCriteriaBuilder();
		CriteriaQuery<Person> query=cb.createQuery(Person.class);
		Root<Person> root=query.from(Person.class);
		Predicate predicate=cb.equal(root.get("id"), id);
		query.where(predicate);
		
		return em.createQuery(query).getSingleResult();
	}
    
   
  
}
