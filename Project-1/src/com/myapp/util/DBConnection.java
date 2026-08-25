package com.myapp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnection {
    private static Connection connection;

    public static Connection getConnection() {

        try{
            if (connection == null || connection.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("driver not found");
                String url = "jdbc:mysql://localhost:3306/sample_db_java?createDatabaseIfNotExists=true";
                connection = DriverManager.getConnection(url, "root", "tiger");
                System.out.println("Connection successful");
                String s1 = "create table if not exists employee1(id INT PRIMARY KEY, name VARCHAR(20), age INT ,branch VARCHAR(20))";
                PreparedStatement p1 = connection.prepareStatement(s1);
                p1.execute();
                System.out.println("Table created");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
//            System.out.println("failed to connect to DB");
        }

        return connection;
    }


}
