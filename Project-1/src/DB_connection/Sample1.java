package DB_connection;

import java.sql.*;

public class Sample1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //step -1 loading and registering your driver class
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url="jdbc:mysql://localhost:3306/java_db?createDatabaseIfNotExist=true";
        String username="root";
        String password="tiger";
        Connection c= DriverManager.getConnection(url, username, password);
        System.out.println("db connection done");

        //creating platform for executing sql queries
        //Statment , PreparedStatement

        String s1="create table if not exists employee(id INT PRIMARY KEY, name VARCHAR(20), dept VARCHAR(20))";
        PreparedStatement p1=c.prepareStatement(s1);
        p1.execute();
        System.out.println("Table created");

        //insert
        //placeholder
        String s2="insert ignore into employee values(?,?,?)";   //setXXX(2,"");
        PreparedStatement p2=c.prepareStatement(s2);
        p2.setInt(1,1);
        p2.setString(2,"ram");
        p2.setString(3,"sales");
        int r1=p2.executeUpdate();
        System.out.println(r1+" rows inserted");
        p2.setInt(1,2);
        p2.setString(2,"riya");
        p2.setString(3,"IT");
        int r2=p2.executeUpdate();
        System.out.println("2nd row inserted");


        String s3="update employee set name=? where id=?";
        PreparedStatement p3=c.prepareStatement(s3);
        p3.setString(1,"sita");
        p3.setInt(2, 1);
        int r3=p3.executeUpdate();
        System.out.println(r3+" rows updated");

//        String s4="delete from employee where id=?";
//        PreparedStatement p4=c.prepareStatement(s4);
//        p4.setInt(1,2);
//        p4.executeUpdate();
//        System.out.println("row deleted");

        //priniting all the rows in table

        String s5="select * from employee";
        PreparedStatement p4=c.prepareStatement(s5);
       ResultSet rows=p4.executeQuery();
        while (rows.next())
        {
            System.out.print(rows.getString(1));
            System.out.print(rows.getString(2));
            System.out.print(rows.getString(3));
            System.out.println();

        }
    }
}

