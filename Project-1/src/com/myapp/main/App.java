package com.myapp.main;

import com.myapp.dao.UserDAO;
import com.myapp.service.UserService;
import com.myapp.util.DBConnection;

import java.sql.Connection;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Connection c =DBConnection.getConnection();
        UserDAO userDAO=new UserDAO(c);
        UserService userService =new UserService(userDAO);

        while (true) {
            System.out.println("Options");
            System.out.println("1. Register");
            System.out.println("2. Update username");
            System.out.println("3. Delete User");
            System.out.println("4. Display all users");

            Scanner s = new Scanner(System.in);
            System.out.println("Enter your choise: ");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter id, name, age, branch:");
                    int id = s.nextInt();
                    String name = s.next();
                    int age = s.nextInt();
                    String branch = s.next();
                    userService.register(id, name, age, branch);
                    break;

                case 2:
                    System.out.println("Enter id,name:");
                    int uid = s.nextInt();
                    String uname = s.next();
                    userService.updateUsername(uname, uid);
                    break;

                case 3:
                    System.out.println("Enter id:");
                    int d_id = s.nextInt();
                    userService.deleteUser(d_id);
                    break;

                case 4:
                    System.out.println("List of al the users: ");
                    userService.displayUsers();
                    break;

                default:
                    System.out.println("Invalid choise");

            }
        }

    }
}
