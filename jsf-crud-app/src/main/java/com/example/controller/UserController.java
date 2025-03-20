package com.example.controller;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.example.model.User;
import com.example.service.UserService;

@ManagedBean
@ViewScoped
public class UserController implements Serializable {
	private static final long serialVersionUID = 1L;

	@EJB
	private UserService userService;

	private User user = new User();
	private List<User> users;

	@PostConstruct
	public void init() {
		loadUsers();
	}

	public void loadUsers() {
		users = userService.getAllUsers();
	}

	public void saveUser() {
		if (user.getId() == null) {
			userService.createUser(user);
			addMessage("User created successfully");
		} else {
			userService.updateUser(user);
			addMessage("User updated successfully");
		}

		user = new User();
		loadUsers();
	}

	public void editUser(User user) {
		this.user = new User(user.getId(), user.getName(), user.getEmail());
	}

	public void deleteUser(Long id) {
		userService.deleteUser(id);
		addMessage("User deleted successfully");
		loadUsers();
	}

	private void addMessage(String message) {
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, message, null));
	}

	// Getters and Setters
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
}
