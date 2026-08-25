package com.myapp.dao;

import com.myapp.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
private Connection c;
       public UserDAO(Connection c){
           this.c=c;

        }
        public int addUser(User user){
           int r1=0;
               try{
                       String s1="insert ignore into employee1 values(?,?,?,?)";   //setXXX(2,"");
                       PreparedStatement p1=c.prepareStatement(s1);
                       p1.setInt(1,user.getId());
                       p1.setString(2, user.getName());
                       p1.setInt(3,user.getAge());
                       p1.setString(4, user.getBranch());
                       r1=p1.executeUpdate();
               }
               catch (SQLException e)
               {
                       System.out.println(e.getMessage());
               }
            return r1;
        }
        public void updateUser(String name, int id){
                try{
                        String s2="update employee1 set name? where id=?";   //setXXX(2,"");
                        PreparedStatement p2=c.prepareStatement(s2);
                        p2.setString(1,name);
                        p2.setInt(2, id);
                        int r2=p2.executeUpdate();
                        System.out.println(r2+" rows updated");
                }
                catch (SQLException e)
                {
                        System.out.println(e.getMessage());
                }
        }
        public void deleteUser(int id){
                try{
                        String s3="delete from employee1 where id=?";   //setXXX(2,"");
                        PreparedStatement p3=c.prepareStatement(s3);
                        p3.setInt(1, id);
                        int r3=p3.executeUpdate();
                        System.out.println(r3+" rows deleted");
                }
                catch (SQLException e)
                {
                        System.out.println(e.getMessage());
                }
        }

        public List<User> getAllUsers(){
                List<User> users=new ArrayList<>();
               try{
                       String s4="select * from employee1";
                       PreparedStatement p4=c.prepareStatement(s4);
                       ResultSet rows=p4.executeQuery();

                       while (rows.next())
                       {
                              User user=new User(
                                      rows.getInt("id"),
                                      rows.getString("name"),
                                      rows.getInt("id"),
                                      rows.getString("branch")
                                      );
                              users.add(user);
                       }
               }
               catch (SQLException e)
               {
                       System.out.println(e.getMessage());
               }
            return  users;
        }
}
