package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DBConnection {

    private static Connection connection;

    public static Connection getConnection() {

        try {

            if (connection == null || connection.isClosed()) {

                Class.forName("com.mysql.cj.jdbc.Driver");

                System.out.println("MySQL driver loaded successfully");

                String url =
                        "jdbc:mysql://localhost:3306/sample_db_java?createDatabaseIfNotExists=true";

                String user = "root";
                String password = "tiger";

                connection = DriverManager.getConnection(
                        url,
                        user,
                        password
                );

                System.out.println("Connection to database successful!");

                String sql =
                        "CREATE TABLE IF NOT EXISTS employee1 (" +
                                "id INT PRIMARY KEY, " +
                                "name VARCHAR(20), " +
                                "age INT, " +
                                "branch VARCHAR(20))";

                PreparedStatement pstmt =
                        connection.prepareStatement(sql);

                pstmt.execute();

                pstmt.close();

                System.out.println(
                        "Table 'employee1' ready"
                );
            }

            return connection;

        } catch (ClassNotFoundException e) {

            System.out.println("MySQL driver not found!");
            e.printStackTrace();

            throw new RuntimeException(e);

        } catch (SQLException e) {

            System.out.println("Database connection failed!");
            e.printStackTrace();

            throw new RuntimeException(e);
        }
    }
}

//public class DBConnection {
//    private static Connection connection;
//
//    public static Connection getConnection() {
//        try {
//            if (connection == null || connection.isClosed()) {
//                // Load MySQL driver
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                System.out.println("MySQL driver loaded successfully");
//
//                // Connection details
//                String url = "jdbc:mysql://localhost:3306/sample_db_java?createDatabaseIfNotExists=true";
//                String user = "root";
//                String password = "tiger";
//
//                // Create connection
//                connection = DriverManager.getConnection(url, user, password);
//                System.out.println("Connection to database successful!");
//
//                // Create table if not exists
//                String createTableSQL = "CREATE TABLE IF NOT EXISTS employee1(" +
//                        "id INT PRIMARY KEY, " +
//                        "name VARCHAR(20), " +
//                        "age INT, " +
//                        "branch VARCHAR(20))";
//
//                PreparedStatement pstmt = connection.prepareStatement(createTableSQL);
//                pstmt.execute();
//                System.out.println("Table 'employee1' ready (created or already exists)");
//                pstmt.close();
//            }
//        }
//        catch (ClassNotFoundException e) {
//            System.out.println("ERROR: MySQL JDBC Driver not found!");
//            System.out.println("   Make sure mysql-connector-java is in pom.xml");
//            e.printStackTrace();
//            return null;
//        }
//        catch (SQLException e) {
//            System.out.println("ERROR: Failed to connect to database!");
//            System.out.println("   Error: " + e.getMessage());
//            System.out.println("   Check:");
//            System.out.println("   1. Is MySQL running? (Start MySQL service)");
//            System.out.println("   2. Correct username? (Current: root)");
//            System.out.println("   3. Correct password? (Current: tiger)");
//            System.out.println("   4. Correct database URL? (Current: jdbc:mysql://localhost:3306/sample_db_java)");
//            e.printStackTrace();
//            return null;
//        }
//        catch (Exception e) {
//            System.out.println("ERROR: Unexpected error!");
//            System.out.println("   Error: " + e.getMessage());
//            e.printStackTrace();
//            return null;
//        }
//
//        return connection;
//    }
//}





















//public class DBConnection {
//    private static Connection connection;
//
//    public static Connection getConnection() {
//
//        try{
//            if (connection == null || connection.isClosed()) {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                System.out.println("driver not found");
//                String url = "jdbc:mysql://localhost:3306/sample_db_java?createDatabaseIfNotExists=true";
//                connection = DriverManager.getConnection(url, "root", "tiger");
//                System.out.println("Connection successful");
//                String s1 = "create table if not exists employee1(id INT PRIMARY KEY, name VARCHAR(20), age INT ,branch VARCHAR(20))";
//                PreparedStatement p1 = connection.prepareStatement(s1);
//                p1.execute();
//                System.out.println("Table created");
//            }
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
////            System.out.println("failed to connect to DB");
//        }
//
//        return connection;
//    }
//
//
//}

