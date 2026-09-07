package org.example.servlets;

import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.dao.UserDAO;
import org.example.service.UserService;
import org.example.util.DBConnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;



@WebServlet("/api/user/*")
public class UserAPIServlet extends HttpServlet {

    //init() --- initialize your db connection
    private UserService userService;

    @Override
    public void init() throws ServletException {
        Connection c=DBConnection.getConnection();
        UserDAO userDAO=new UserDAO(c);
        userService=new UserService(userDAO);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //req → contains information coming from the client
        //resp → used to send information back to the client
        //5173, //8080
        enableCORS(resp);  //CORD -Cross origin Request source
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");  //UTF-8 --> charcter encoding format

        String pathInfo= req.getPathInfo();
        //api/user/ === pathIfo == "/"
        //api/user/101 ===> pathIfo == "/1"
        //api/user/riya ==> pathInfo="/riya"

        PrintWriter out = resp.getWriter();
        Gson gson = new Gson();  //convert JSON --> Java Object , Java object --> JSON
//       out.print("Hello ");

        // GET /api/user/ → Get all users
            if (pathInfo == null || pathInfo.equals("/")) {
                Object users = userService.getAllUsers();  //getAllUSers --returns data in the form of Java object
                out.print(gson.toJson(users));   //converting java obj --> json format--> print using PrintWriter out
            }
//        [
//          id=1,name="riya"...
//        id=1,name="riya"...
//        id=1,name="riya"...

//          ]

        /*
        * [
        *   {id: 1,name:"riya"}
        * {id: 1,name:"riya"}
        * {id: 1,name:"riya"}
        * {id: 1,name:"riya"}
        * ]
        *
        *
        * */
    }
    private void enableCORS(HttpServletResponse resp) {
        resp.setHeader("Access-Control-Allow-Origin", "*");
        resp.setHeader("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        enableCORS(resp);
//        resp.setContentType("application/json");
//        resp.setCharacterEncoding("UTF-8");
//
//        PrintWriter out = resp.getWriter();
//        Gson gson = new Gson();
//
//        try {
//            // Read JSON body
//            StringBuilder sb = new StringBuilder();
//            String line;
//            java.io.BufferedReader br = req.getReader();
//            while ((line = br.readLine()) != null) {
//                sb.append(line);
//            }
//
//            // Parse JSON
//            UserRequest userReq = gson.fromJson(sb.toString(), UserRequest.class);
//
//            // Register user
//            userService.register(userReq.id, userReq.name, userReq.age, userReq.branch);
//
//            out.print("{\"message\": \"User registered successfully\"}");
//            System.out.println("User registered: " + userReq.name);
//
//        } catch (Exception e) {
//            out.print("{\"error\": \"" + e.getMessage() + "\"}");
//            System.out.println("Error: " + e.getMessage());
//        }
//        out.flush();
    }


    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}

