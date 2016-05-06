/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karki.jaxrs.controller;

import com.karki.jaxrs.dao.CustomerDao;
import com.karki.jaxrs.dao.impl.CustomerDaoImpl;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sharmila
 */
@WebServlet(name = "loginController",urlPatterns = "/login/*")
public class LoginController extends Controller{
    private CustomerDao customerDao=new CustomerDaoImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email=request.getParameter("email");
        String password=request.getParameter("password");
        
        customerDao.login(email, password);
        request.setAttribute("loggedIn", true);
    }
 
}
