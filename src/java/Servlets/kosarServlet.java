package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet kosarServlet</title>");
        out.println("</head>");
        out.println("<body>");
        kosar.stream().forEach(item -> {
            out.println(item + "<br>");
        });
        out.println("</body>");
        out.println("</html>");
        out.close();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Enumeration<String> tIDs = request.getParameterNames();

        while (tIDs.hasMoreElements()) {
            try {
                String sTID = tIDs.nextElement();
                Integer tID = Integer.parseInt(sTID);
                termek term = tservice.findTermek(tID);
                int amount = Integer.parseInt(request.getParameter(sTID));
                termekkosar newKItem = new termekkosar(term.getTID(), term.getNev(), term.getAr(), amount);
                if (!kosar.contains(newKItem)) {
                    kosar.add(newKItem);
                } else {
                    termekkosar kItem = kosar.stream().filter(kosarItem -> kosarItem.getTID().equals(tID)).findFirst().get();
                    kItem.setMennyiseg(kItem.getMennyiseg() + amount);
                }
            } catch (Exception e) {
            }
        }
        response.sendRedirect("kosar.html");

    }
}
