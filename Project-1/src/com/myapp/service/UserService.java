package com.myapp.service;

import com.myapp.dao.UserDAO;
import com.myapp.model.User;

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

//    public List<User> getAllUsers() {
//       List<User> list=new ArrayList<>();
//
//            userDAO.getAllUsers();
//    }
}

//servlet---->service--->DAO-->db
