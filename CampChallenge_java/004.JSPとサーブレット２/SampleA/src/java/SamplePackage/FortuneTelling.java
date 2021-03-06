/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package SamplePackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;
import java.util.Random;
import javax.servlet.RequestDispatcher;
import SamplePackage.ResultData; // 宣言する必要がある？

/**
 *
 * @author yoshi
 */
public class FortuneTelling extends HttpServlet {

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
            
            final String result = "/WEB-INF/jsp/FortuneTellingResult.jsp";
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SampleA1</title>");            
            out.println("</head>");
            out.println("<body>");
            // out.println("<h1>Servlet SampleA1 at " + request.getContextPath() + "</h1>");
            String luckList[] = {"大吉","中吉","小吉","吉","半吉","末吉","凶","半凶","中凶","大凶"};
            
            // ランダムのインスタンスを作る。インスタンスなので、Randomというクラスの特徴を全て持っている。
            Random rnd = new Random();
            //luck
            Integer index = rnd.nextInt(luckList.length);
            
            out.print("今日のあなたの運勢は.....");
            out.println(luckList[index]);
            out.println("</body>");
            out.println("</html>");
            
            
            
            ResultData data = new ResultData();
            data.setD(new Date());
            data.setLuck(luckList[index]);
            request.setAttribute("DATA", data);
            
            RequestDispatcher rd = request.getRequestDispatcher(result);
            rd.forward(request, response);
            
            
            
            
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
