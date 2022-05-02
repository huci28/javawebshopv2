
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import manager.*;


public class kosarServlet extends HttpServlet {

    termekservice tservice = new termekservice();
    private List<termekkosar> kosar = new ArrayList<>();
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet kosarServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet kosarServlet at " + request.getContextPath() + "</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();
        
    }
}

  
