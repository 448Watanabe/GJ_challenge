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

/**
 *
 * @author yoshi
 */
public class abstrusction2 extends HttpServlet {

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
            out.println("<title>Servlet abstrusction1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet abstrusction1 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    
public class cameraman{
    // 初期変数の設定
    public String phrase = "いいねー";
    public String name = "ボブ";
    public String camera_type = "canon";
    // セット関数
    public void setPhrase(String name){
        this.phrase = phrase;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCameraType(String camera_name){
        camera_type = camera_name;
    }
    // 動作の設定
    public void sayPhrase(PrintWriter out){
        out.print(phrase + "<br>......やっぱり<br>" + phrase);
    }
    public void sayName(PrintWriter out){
        out.print("俺の名前は" + name + "だぜ。<br>");
    }
    public void sayCameraType(PrintWriter out){
        out.print("俺は" + camera_type +"を使ってるぜー！<br>");
    }
}

public class model{
    // 変数
    public int hight = 180;
    public String name = "ラリー";
    public String charc = "元気";
    // 関数
    public boolean pose(){
        return true; // ここはただ練習の為に
    }
    public void showOff(PrintWriter out){
        out.print("俺、、" + name + "<br>身長は" + hight + "<br>つまり俺は格好良い！");
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
