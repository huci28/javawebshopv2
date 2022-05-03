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
        out.println("<title>Termékeink</title>");
        out.println("<link rel=\"stylesheet\" href=\"termekstyle.css\" type=\"text/css\">");
        out.println("<link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n" +
        "<link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n" +
        "<link href=\"https://fonts.googleapis.com/css2?family=Oswald&display=swap\" rel=\"stylesheet\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2 id='chooseProduct'>Válasszon termékeink széles kínálatából!</h2>");
        out.println("<form  id='termekekform' action = 'kosar.html' method = 'POST'>");
        tservice.getTermekek().forEach(term -> {
            out.println("<div class='products'>" + term + " Ft " + "<input type = 'number'  min=\"0\" max=\"99\" name = '" + term.getTID() + "'/></div><BR>");
        });
        out.println("<div class='pictures'>");
        out.println("<img src=\"images/protein.jpg\" alt=\"Whey\" width=\"50\" height=\"50\">");
        out.println("<img src=\"images/MassGainer.jpg\" alt=\"MassGainer\" width=\"50\" height=\"50\">");
        out.println("<img src=\"images/FatBurner.jpg\" alt=\"FatBurner\" width=\"50\" height=\"50\">");
        out.println("<img src=\"images/Vitamin.jpg\" alt=\"Vitamin\" width=\"50\" height=\"50\">");
        out.println("<img src=\"images/JointSupport.jpg\" alt=\"JointSupport\" width=\"50\" height=\"50\">");
        out.println("<img src=\"images/PreWorkout.jpg\" alt=\"PreWorkout\" width=\"50\" height=\"50\">");
        out.println("</div>");
        out.println("<input type = 'submit' value = 'Megrendel'/>");
        out.println("</form>");
        out.println("<form action = 'belepes.html'>");
        out.println("<input type = 'submit' value = 'Kilépés'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        out.close();
       
    }}
    
 