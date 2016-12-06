/*
Copyright (c) 2016 Christy Smith
Campus Box 7915, Elon University, Elon, NC 27244

Copyright (c) 2016 Charles Kim
Campus Box 8462, Elon University, Elon, NC 27244

File also came from Murach

 */
package controller;

import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;

import model.User;
import data.UserDB;

public class UsersServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();

        String url = "/index.jsp";
        
        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "to_beginning";  // default action
        }
        /*
        // perform action and set URL to appropriate page
        if (action.equals("display_users")) {            
            // get list of users
            ArrayList<User> users = UserDB.selectUsers();            
            request.setAttribute("users", users);
            
        } 
        else if (action.equals("display_user")) { 
            // get user for specified email
            String emailAddress = request.getParameter("email");
            User user = UserDB.selectUser(emailAddress);
            // set as session attribute
            session.setAttribute("user", user);
            // forward to user.jsp
            url = "/user.jsp";
        }
        
        else if (action.equals("delete_user")) {
            // get the user for the specified email 
            String email = request.getParameter("email");
            User user = UserDB.selectUser(email);
            // delete the user            
             UserDB.delete(user);
            // get current list of users
            ArrayList<User> users = UserDB.selectUsers();
            // set as request attribute
            request.setAttribute("users", users); 
            // forward to index.jsp
           // url = "/index.jsp";    
        }*/
        
        getServletContext()
                .getRequestDispatcher(url)
                .forward(request, response);
    }    
    
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }    
}