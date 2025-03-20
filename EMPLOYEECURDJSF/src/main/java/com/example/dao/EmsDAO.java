package com.example.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.model.Ems;

import com.example.util.HibernateUtil;



public class EmsDAO {
	
	
	public void saveEms(Ems ems) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(ems);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
	}
	
	public List<Ems> getAll(){
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.createQuery("from Ems", Ems.class).list();
        }
	}
	
    public void delete(Ems ems) {
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.delete(ems);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
    }
    
	public void update(Ems ems) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.update(ems);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        }
	}
	public Ems findById(int id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            return session.get(Ems.class, id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
