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

    public void register(int id, String name, int age, String branch){
        if(name=="" || name.isEmpty())
        {
            System.out.println("name is required");
        }
        if(age<18)
        {
            System.out.println("not eligible");
        }
        User user=new User(id,name,age,branch);
        int rows=userDAO.addUser(user);
        if(rows>0) {
            System.out.println("User registered: " + name);
        }
    }

    public void updateUsername(String name, int id)
    {
        if (name == null || name.isEmpty()) {
            System.out.println("Name cannot be empty");
            return;
        }
        userDAO.updateUser(name, id);
        System.out.println("User updated");
    }

    public void deleteUser(int id)
    {
        userDAO.deleteUser(id);
        System.out.println("User deleted");
    }


    public void displayUsers()
    {
        List<User> users = userDAO.getAllUsers();

        if (users.isEmpty()) {
            System.out.println("No users found");
        }

        System.out.println("\n=== All Users ===");
        for (User user : users) {
            System.out.println(user.getId()+" "+user.getName()+" "+user.getBranch()+" "+ user.getAge());
        }

    }

    public Object getAllUsers() {
        try {
            List<?> users = userDAO.getAllUsers();
            System.out.println("Retrieved " + users.size() + " users");
            return users;
        } catch (Exception e) {
            System.out.println("Error fetching users: " + e.getMessage());
            return null;
        }
    }
}

//servlet---->service--->DAO-->db
