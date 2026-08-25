package com.myapp.servlet;

import com.myapp.dao.UserDAO;
import com.myapp.service.UserService;
import com.myapp.util.DBConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

@WebServlet("/api/user/*")
public class UserAPIServlet extends HttpServlet{

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

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id=Integer.parseInt(req.getParameter("id"));
        String name=req.getParameter("name");
        int age=Integer.parseInt(req.getParameter("age"));
        String branch=req.getParameter("branch");
        userService.register(id, name, age, branch);
        System.out.println("user registered");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}

