package com.example.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.example.model.Company;

public class CompanyDao {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	public CompanyDao() {
		emf=Persistence.createEntityManagerFactory("CU");
		em=emf.createEntityManager();	
	}
	
	public void insert(Company company) {
		em.getTransaction().begin();
		em.persist(company);
		em.getTransaction().commit();
		close();
		
	}
	public List<Company> getAll() {
		CriteriaBuilder cb=em.getCriteriaBuilder();
		CriteriaQuery<Company> query=cb.createQuery(Company.class);
		Root<Company> root=query.from(Company.class);
		query.select(root);
		return em.createQuery(query).getResultList();
	}
	
	public Company getOne(int id) {
		CriteriaBuilder cb=em.getCriteriaBuilder();
		CriteriaQuery<Company> query=cb.createQuery(Company.class);
		Root<Company> root=query.from(Company.class);
		
		Predicate predicate=cb.equal(root.get("cId"), id);
		query.where(predicate);
		
		return em.createQuery(query).getSingleResult();
	}
	
	
	public List<Object[]> getOnlyColums(){
		CriteriaBuilder cb=em.getCriteriaBuilder();
		CriteriaQuery<Object[]> query=cb.createQuery(Object[].class);
		Root<Company> root=query.from(Company.class);
		query.select(cb.array(root.get("cName"), root.get("Address")));
		
		return em.createQuery(query).getResultList();
	}
	
	public List<Company> getFilterByAddress(String Address){
		
		CriteriaBuilder cb=em.getCriteriaBuilder();
		CriteriaQuery<Company> query=cb.createQuery(Company.class);
		Root<Company> root=query.from(Company.class);
		
		Predicate predicate=cb.equal(root.get("Address"), Address);
		query.where(predicate);

		return em.createQuery(query).getResultList();
	}
	
	public List<Company> getFilterByCompAndAddress(String company, String Address){
		
		CriteriaBuilder cb=em.getCriteriaBuilder();
		CriteriaQuery<Company> query=cb.createQuery(Company.class);
		Root<Company> root=query.from(Company.class);
		
		Predicate predicate1=cb.equal(root.get("cName"), company);
		Predicate predicate2=cb.equal(root.get("Address"), Address);
		Predicate predicate3=cb.and(predicate1,predicate2);
		query.where(predicate3);
		
		return em.createQuery(query).getResultList();
	}
	
	public List<Company> getFilterbyOrAddress(String Address1, String Address2){
		
		CriteriaBuilder cb=em.getCriteriaBuilder();
		CriteriaQuery<Company> query=cb.createQuery(Company.class);
		Root<Company> root=query.from(Company.class);
		
		Predicate predicate1=cb.equal(root.get("Address"), Address1);
		Predicate predicate2=cb.equal(root.get("Address"), Address2);
		Predicate predicate=cb.or(predicate1,predicate2);
		query.where(predicate);
		
		return em.createQuery(query).getResultList();
	}
	
	public void update(int id, String Address) {
		CriteriaBuilder cb=em.getCriteriaBuilder();
		CriteriaUpdate<Company> cu=cb.createCriteriaUpdate(Company.class);
		Root<Company> root=cu.from(Company.class);
		cu.set("Address", Address);
		cu.where(cb.equal(root.get("cId"), id));
		em.getTransaction().begin();
		em.createQuery(cu).executeUpdate();
		em.getTransaction().commit();
	}
	
	public void delete(int id) {
		CriteriaBuilder cb=em.getCriteriaBuilder();
		CriteriaDelete<Company> cd=cb.createCriteriaDelete(Company.class);
		Root<Company> root=cd.from(Company.class);
		Predicate predicate=cb.equal(root.get("cId"), id);
		cd.where(predicate);
		em.getTransaction().begin();
		em.createQuery(cd).executeUpdate();
		em.getTransaction().commit();
	}
	
	public List<Company> getDescOrder(){
		
		CriteriaBuilder cb=em.getCriteriaBuilder();
		CriteriaQuery<Company> query=cb.createQuery(Company.class);
		Root<Company> root=query.from(Company.class);
		query.select(root);
		query.orderBy(cb.desc(root.get("cId")));
		return em.createQuery(query).getResultList();
	}
	
	public List<Company> getAscOrder(){
		
		CriteriaBuilder cb=em.getCriteriaBuilder();
		CriteriaQuery<Company> query=cb.createQuery(Company.class);
		Root<Company> root=query.from(Company.class);
		query.select(root);
		query.orderBy(cb.asc(root.get("cId")));
		
		return em.createQuery(query).getResultList();
	}
	
	public List<Company> filterByLike(){
		
		CriteriaBuilder cb=em.getCriteriaBuilder();
		CriteriaQuery<Company> query=cb.createQuery(Company.class);
		Root<Company> root=query.from(Company.class);
		Predicate predicate=cb.like(root.get("cName"), "S%");
		query.where(predicate);
		return em.createQuery(query).getResultList();
	}
	
	
	
	public void close() {
		emf.close();
		em.close();
	}
}
