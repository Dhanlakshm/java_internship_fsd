package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Sample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //Step-1 --Loding and registering the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Step-2 --establish connection btw java and db
        String url="jdbc:mysql://localhost:3306/sample_db_python?createDatabaseIfNotExist=true";
        String user="root";
        String pass="tiger";
        Connection c=DriverManager.getConnection(url, user, pass);
        System.out.println("db connection successfull");
    }
}
