package com.example.bean;

import com.example.dao.UserDAO;
import com.example.model.User;
import javax.faces.bean.ManagedBean;
import java.util.List;

@ManagedBean
public class UserBean {
    private User user = new User();
    private UserDAO userDAO = new UserDAO();

    public void saveUser() {
        userDAO.saveUser(user);
        user = new User(); // Reset user
    }

    public List<User> getUsers() {
        return userDAO.getUsers();
    }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
