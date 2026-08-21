package DB_connection;

import java.sql.*;

public class Sample {
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

        Statement s=c.createStatement();
        String sql="create table if not exists student(id INT PRIMARY KEY, name VARCHAR(20))";
        s.execute(sql);
        System.out.println("table created");

        String s2="insert ignore into student values(1,'riya')";
        int rows=s.executeUpdate(s2);
        System.out.println(rows+" rows instered");

        String s3="update student set name='siya' where id=1";
        int rows1=s.executeUpdate(s3);
        System.out.println(rows1+" rows updated");

        String s4="insert ignore into student values(2,'sima')";
        s.executeUpdate(s4);

//        String delq="delete from student where id=2";
//       int r= s.executeUpdate(delq);
//        System.out.println(r+" rows deleted");


        //printing all the rows in the table

        String s5="select * from student";
        ResultSet set=s.executeQuery(s5);

        while (set.next())
        {
            System.out.print(set.getInt("id"));
            System.out.print(set.getString("name"));
            System.out.println();
        }






        //quiers-->
        //DDL --> create, alter, drop, truncate
        //DQL --> Select
        //DML --> insert, delete, update

        //execute() --> common   --- boolean , int
        //executeUpdate() --> dml -- int
        //executeQuery()  --> ddl, dql  -- ResultSet r
    }

}
