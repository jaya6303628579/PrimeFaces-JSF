package com.example.service;

import com.example.model.User;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class UserService {
	@PersistenceContext(unitName = "userPU")
	private EntityManager em;

	// Create
	public User createUser(User user) {
		em.persist(user);
		return user;
	}

	// Read
	public User getUserById(Long id) {
		return em.find(User.class, id);
	}

	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {
		return em.createQuery("SELECT u FROM User u").getResultList();
	}

	// Update
	public User updateUser(User user) {
		return em.merge(user);
	}

	// Delete
	public boolean deleteUser(Long id) {
		User user = getUserById(id);
		if (user != null) {
			em.remove(user);
			return true;
		}
		return false;
	}
}