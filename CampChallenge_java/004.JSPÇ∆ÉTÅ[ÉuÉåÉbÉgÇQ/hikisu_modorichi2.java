/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;

/**
 *
 * @author yoshi
 */
public class hikisu_modorichi2 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hikisu_modorichi2</title>");            
            out.println("</head>");
            out.println("<body>");
            //out.println("<h1>Servlet hikisu_modorichi2 at " + request.getContextPath() + "</h1>");
            printMultiProfile(out, 1);
            printMultiProfile(out, 3);
            printMultiProfile(out, 2);
            out.println("</body>");
            out.println("</html>");
        }
    }
 void printMultiProfile(PrintWriter out, int num){
        ArrayList <String> profile1 = new ArrayList <String>();
        ArrayList <String> profile2 = new ArrayList <String>();
        ArrayList <String> profile3 = new ArrayList <String>();
        
        profile1.add("1");
        profile1.add("yoshi");
        profile1.add("1987");
        profile1.add("Fukushima");
        
        profile2.add("2");
        profile2.add("tanaka");
        profile2.add("1986");
        profile2.add("iwaki");

        profile3.add("3");
        profile3.add("nakata");
        profile3.add("1000");
        profile3.add(null);
        
        
        String content;
        //out.print(num_casted.getClass() + "<br>");
        //out.print("".getClass());
        
        int num_repeat = 0;
        int limit = 2;
        
        while(num_repeat <= limit){
                for(int i = 1; i <= 3; i++){
                content = profile1.get(i);
                if(content != null){
                out.print(content + "<br>");
                }
                num_repeat++;
                
                }
                for(int i = 1; i <= 3; i++){
                content = profile2.get(i);
                if(content != null){
                out.print(content + "<br>");
                }
                }
                num_repeat++;
                
                for(int i = 1; i <= 3; i++){
                content = profile3.get(i);
                if(content != null){
                out.print(content + "<br>");
                }
                }
                num_repeat++;
        }
        }
        //out.print(profile3.get(3));
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
