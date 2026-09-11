package org.example.servlets;

import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.example.dao.UserDAO;
import org.example.model.User;
import org.example.service.UserService;
import org.example.util.DBConnection;

import java.io.BufferedReader;
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
        System.out.println("Connection: " + c);
        UserDAO userDAO=new UserDAO(c);
        userService=new UserService(userDAO);
    }
    @Override
    protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        enableCORS(resp);
        resp.setStatus(HttpServletResponse.SC_OK);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //req → contains information coming from the client
        //resp → used to send information back to the client
        //5173, //8080
        enableCORS(resp);  //CORD -Cross origin Request source
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");  //UTF-8 --> charcter encoding format

        String pathInfo = req.getPathInfo();
        //api/user/ === pathIfo == "/"
        //api/user/101 ===> pathIfo == "/1"
        //api/user/riya ==> pathInfo="/riya"

        PrintWriter out = resp.getWriter();  //out.print("hello")
        Gson gson = new Gson();  //convert JSON --> Java Object , Java object --> JSON

        // GET /api/user/ → Get all users
        if (pathInfo == null || pathInfo.equals("/")) {
            Object users = userService.getAllUsers();
            if (users != null) {
                resp.setStatus(HttpServletResponse.SC_OK);  //200-OK
                out.print(gson.toJson(users));
            }
            else {

                resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);  //500-Internal server error
                out.print("{\"error\": \"Failed to fetch users\"}");
            }
        }

    }
    private void enableCORS(HttpServletResponse resp) {
        resp.setHeader("Access-Control-Allow-Origin", "http://localhost:5173");
        resp.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        resp.setHeader("Access-Control-Allow-Headers", "Content-Type, Accept");
        resp.setHeader("Access-Control-Allow-Credentials", "true");
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        enableCORS(resp);
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter out = resp.getWriter();
        Gson gson = new Gson();

        try {
            // Read JSON body
            StringBuilder sb = new StringBuilder();  //string sb="";
            String line;
            BufferedReader br = req.getReader();
            while ((line = br.readLine()) != null) {  //be.readLine()--> line=null !=null
                sb.append(line);                //sb={"id":3,name, ag, abe}
            }
//Json ---> JSON string ---> java object (user)
            //sb.toString()="{\"id\":101,\"name\":\"Rahul\",\"age\":22,\"branch\":\"CSE\"}"
            //contains JSON as String
            // Parse JSON(POST-data sent by user(JSON) ---> convert to Java Object)
            User user = gson.fromJson(sb.toString(), User.class);  //Json string --> Java object

            // Register user
            userService.register(user.getId(), user.getName(), user.getAge(), user.getBranch());

            out.print("{\"message\": \"User registered successfully\"}");
            System.out.println("User registered: " + user.getName());

        }
        catch (Exception e) {

            out.print("{\"error\": \"" + e.getMessage() + "\"}");
            System.out.println("Error: " + e.getMessage());
        }
        out.flush();
    }


    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        enableCORS(resp);
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter out = resp.getWriter();
        Gson gson = new Gson();

        try {

            // Read JSON body
            StringBuilder sb = new StringBuilder();
            String line;
            BufferedReader br = req.getReader();

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
//sb={id, nanme, age, branch} --> json string --> java obj
            // Convert JSON to User object
            User user = gson.fromJson(sb.toString(), User.class);

            // Update user
            boolean result = userService.updateUser(
                    user.getId(),
                    user.getName(),
                    user.getAge(),
                    user.getBranch()
            );
            if (result) {
                resp.setStatus(HttpServletResponse.SC_OK);

                out.print("{\"message\":\"User updated successfully\"}");
            }
            else {
                resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);

                out.print("{\"error\":\"Failed to update user\"}");
            }
        }
        catch (Exception e)
        {
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            out.print("{\"error\":\"" + e.getMessage() + "\"}");
            e.printStackTrace();
        }


    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        enableCORS(resp);
        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter out = resp.getWriter();

        try {

            String pathInfo = req.getPathInfo();

            // pathInfo=/101
            if (pathInfo == null || pathInfo.equals("/"))
            {
                resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                out.print("{\"error\":\"User ID is required\"}");
                return;
            }

            // remove "/" from "/101"
            String idString = pathInfo.substring(1);
            int id = Integer.parseInt(idString);
            // call DeleteUser method
            boolean result = userService.deleteUser(id);

            if (result) {
                resp.setStatus(HttpServletResponse.SC_OK);
                out.print("{\"message\":\"User deleted successfully\"}");

            }
            else {
                resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
                out.print("{\"error\":\"Failed to delete user\"}");
            }

        }
        catch (NumberFormatException e) {
            resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            out.print("{\"error\":\"Invalid user ID\"}");

        }
        catch (Exception e) {
            resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            out.print("{\"error\":\"" + e.getMessage() + "\"}");
        }

        out.flush();

    }
}

