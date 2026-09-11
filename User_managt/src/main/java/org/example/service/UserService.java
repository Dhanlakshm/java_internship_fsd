package org.example.service;

import org.example.dao.UserDAO;
import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {

    private UserDAO userDAO;

    public UserService(UserDAO userDAO){
        this.userDAO=userDAO;
    }

    public boolean register(int id, String name, int age, String branch){
        // Validation
        if(name == null || name.isEmpty()) {
            System.out.println("Name is required");
            return false;
        }
        if(age < 18) {
            System.out.println("Age must be at least 18");
            return false;
        }

        try {
            User user = new User(id, name, age, branch);
            int rows = userDAO.addUser(user);
            if(rows > 0) {
                System.out.println("User registered: " + name);
                return true;
            }
        } catch (Exception e) {
            System.out.println("Error registering user: " + e.getMessage());
        }
        return false;
    }

    // UPDATE USER
    public boolean updateUser(int id, String name, int age, String branch) {
        if (name == null || name.isEmpty()) {
            System.out.println("Name cannot be empty");
            return false;
        }

        try {
            userDAO.updateUser(name, id);
            System.out.println("User updated: ID " + id);
            return true;
        } catch (Exception e) {
            System.out.println("Error updating user: " + e.getMessage());
            return false;
        }
    }

    // DELETE USER
    public boolean deleteUser(int id) {
        try {
            userDAO.deleteUser(id);
            System.out.println("User deleted: ID " + id);
            return true;
        } catch (Exception e) {
            System.out.println("Error deleting user: " + e.getMessage());
            return false;
        }
    }

    // GET ALL USERS
    public List<User> getAllUsers() {
        try {
            List<User> users = userDAO.getAllUsers();
            System.out.println("Retrieved " + users.size() + " users");
            return users;
        } catch (Exception e) {
            System.out.println("Error fetching users: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    // DISPLAY ALL USERS (for console - not used by servlet)
    public void displayUsers() {
        List<User> users = userDAO.getAllUsers();

        if (users == null || users.isEmpty()) {
            System.out.println("No users found");
            return;
        }

        System.out.println("\n=== All Users ===");
        for (User user : users) {
            System.out.println(user.getId() + " | " + user.getName() + " | " +
                    user.getAge() + " | " + user.getBranch());
        }
    }
}
