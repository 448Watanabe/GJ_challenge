/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

/**
 *
 * @author yoshi
 */
public class replaceString extends HttpServlet {

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
            out.println("<title>Servlet replaceString</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String oldStr = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
            String newStr1 = oldStr.replace("U", "う");
            String newStr2 = newStr1.replace("I","い");
            /*
            String newStr2 = oldStr.replace("U", "う");
            String newStr3 = oldStr.replace("U", "う");
            String newStr4 = oldStr.replace("U", "う");
            String newStr5 = oldStr.replace("U", "う");
            */
            out.print(newStr2);
            /*
            String newStr;
            String nextStr;
            String correctedStr;
            int index = oldStr.indexOf("U");
            ArrayList <String> arr = new ArrayList<String>();
            
            if(oldStr.indexOf("U") > 0){
                do{                           
                    newStr = oldStr.replace("U","う");
                    
                    correctedStr = oldStr.substring(0,index);
                    oldStr = oldStr.substring(index+1);
                    
                    arr.add(correctedStr);
                    index = oldStr.indexOf("U");
                }
                while(index > 0);
            }
            
            for(int i = 0; i < arr.size() - 1; i++){
                out.print(arr.get(i));
            }
            */
            //out.println("<h1>Servlet replaceString at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
