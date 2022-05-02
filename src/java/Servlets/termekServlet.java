/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import manager.termekservice;

public class termekServlet extends HttpServlet {
    
    termekservice tservice = new termekservice();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
       PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet termekServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<form action = 'kosar.html' method = 'POST'>");
        tservice.getTermekek().forEach(term -> {
            out.println(term + "<input type = 'number' name = '' " + term.getTID() + "'/><BR>");
        });
        out.println("<input type = 'submit' value = 'Megrendel'/>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        out.close();
       
    }}
    
 