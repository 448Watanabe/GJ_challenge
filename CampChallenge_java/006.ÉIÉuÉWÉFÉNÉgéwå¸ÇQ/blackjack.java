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
public class blackjack extends HttpServlet {

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
            out.println("<title>Servlet blackjack</title>");            
            out.println("</head>");
            out.println("<body>");
            // out.println("<h1>Servlet blackjack at " + request.getContextPath() + "</h1>");
            Dealer yoshi = new Dealer();
            User   bobob = new User();
            out.print("make an instance.<br>");
            
            yoshi.setCard(out, yoshi.deal(out));
            // out.print("<br>" + yoshi.cards.size() + "<br><br>");
            bobob.setCard(out, yoshi.deal(out));
            // out.print("<br>" + yoshi.cards.size() + "<br><br>");
            out.print("Deal and set are done at this point.<br>");
            
            out.print("<br>" + yoshi.open(yoshi.myCards) + "<br>");
            out.print("<br>" + yoshi.open(bobob.myCards) + "<br>");
            
            // 以下ヒットするか否かのフェイズ
            boolean a = yoshi.checkSum(yoshi.open(yoshi.myCards));
            boolean b = bobob.checkSum(bobob.open(bobob.myCards));
            
            while(!(a == false && b == false)){ 
                if( a == true && b == true){
                    out.print("both hit.<br>");
                    yoshi.setCard(out, yoshi.hit());
                    bobob.setCard(out, yoshi.hit());
                    a = yoshi.checkSum(yoshi.open(yoshi.myCards));
                    b = bobob.checkSum(bobob.open(bobob.myCards));
                    out.print("<br>" + yoshi.open(yoshi.myCards) + "<br>");
                    out.print("<br>" + yoshi.open(bobob.myCards) + "<br>");
                    
                }else if(a == true && b == false){
                    out.print("Dealer hits.<br>");
                    yoshi.setCard(out, yoshi.hit());
                    a = yoshi.checkSum(yoshi.open(yoshi.myCards));
                    out.print("<br>" + yoshi.open(yoshi.myCards) + "<br>");
                    out.print("<br>" + yoshi.open(bobob.myCards) + "<br>");
                }else if(a == false && b == true){
                    out.print("User hits<br>");
                    bobob.setCard(out, yoshi.hit());
                    b = bobob.checkSum(bobob.open(bobob.myCards));
                    out.print("<br>" + yoshi.open(yoshi.myCards) + "<br>");
                    out.print("<br>" + yoshi.open(bobob.myCards) + "<br>");
                    
                }else{
                    out.print("Something is wrong.<br>");
                }           
            }
            
            
            boolean c = (yoshi.open(yoshi.myCards) >= 22);
            boolean d = (bobob.open(bobob.myCards) >= 22);
            
            // ifとelse ifの中でどちらかないしは両方が21を超えていないか確認
            if(c == true && d == true){
                out.print("Draw since both exceed 21.");
            }else if(c == true){
                out.print("User wins since dealer exceeds 21.");
            }else if(d == true){
                out.print("Dealer wins since user exceeds 21.");
            }else{          
                // 両者22以下の時の勝敗
                if(yoshi.open(yoshi.myCards) == bobob.open(bobob.myCards)){
                    out.print("二人とも同じ値で引き分けやー、ブラボー<br>");
                }else if(yoshi.open(yoshi.myCards) > bobob.open(bobob.myCards)){
                    out.print("Dealer wins.");
                }else if(yoshi.open(yoshi.myCards) < bobob.open(bobob.myCards)){
                    out.print("User wins.");
                }
            }
            
            
            
            
            
            //yoshi.handout();
            
            //out.print(yoshi.myCards.size());
            //out.print(yoshi.myCards.get(0));
            //out.print(yoshi.myCards.get(12));
            
            out.println("</body>");
            out.println("</html>");
        }
    }

abstract class Human{
    abstract int open(ArrayList arr);
    abstract void setCard(PrintWriter out, ArrayList<Integer> arr);
    abstract boolean checkSum(int sum);
    ArrayList<Integer> myCards = new ArrayList<Integer>();
}     

class Dealer extends Human{
    ArrayList<Integer> myCards = new ArrayList<Integer>();
    ArrayList<Integer> cards = new ArrayList<Integer>(); 

    Dealer(){
        
        Random rnd = new Random();
        for(int n = 1; n <= 4; n++){
            for(int i = 1; i <= 13; i++){
                cards.add(i);
            }
        }
    }
    public ArrayList<Integer> deal(PrintWriter out){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random rnd = new Random();
       
        for(int i = 1; i <= 2; i++){
        int ran = rnd.nextInt(cards.size()-1);
        out.print("ran<br>" + ran + "<br>");
        arr.add(cards.get(ran));
        out.print("arr.get<br>"+arr.get(i-1) + "<br>");
        cards.remove(ran);
        }
//        arr.add(ran);        
        return arr;
    }
    public ArrayList<Integer> hit(){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Random rnd = new Random();
       
        int ran = rnd.nextInt(cards.size()-1);
        arr.add(cards.get(ran));
        cards.remove(ran);
        
        return arr;
    }
    // inherited methods 
    int open(ArrayList arr){
        ArrayList<Integer> arra = new ArrayList<Integer>();
        arra = arr;
        int sum = 0;

        for(int i = 0; i <= arra.size()-1; i++){
            sum = sum + arra.get(i);
        }
        return sum;
    }
    void setCard(PrintWriter out, ArrayList arr){
        //ArrayList<Integer> arra = new ArrayList<Integer>();
        //arra = null;
       // arra = arr;
        // out.print(arr.size() + "<br>");
        // out.print(arra.size() + "<br>");
        for(int i = 0; i <= arr.size()-1; i++){
            myCards.add((Integer)arr.get(i));
            //out.print("arra.get0<br>" + myCards.get(i) + "<br>");
        }
    }
    boolean checkSum(int sum){
        if(sum <= 17){
            return true;
        }else{
            return false;
        }
    }  
}

class User extends Human{
    
    // void User(){}
    int open(ArrayList arr){
        ArrayList<Integer> arra = new ArrayList<Integer>();
        arra = arr;
        int sum = 0;

        for(int i = 0; i <= arra.size()-1; i++){
            sum = sum + arra.get(i);
        }
        
        return sum;
    }        
    void setCard(PrintWriter out, ArrayList<Integer> arr){
        ArrayList<Integer> arra = new ArrayList<Integer>();
        arra = null;
        arra = arr;
        // out.print(arr.size() + "<br>");
        // out.print(arra.size() + "<br>");
        for(int i = 0; i <= arra.size()-1; i++){
            myCards.add(arra.get(i));
            //out.print("arra.get0<br>" + myCards.get(i) + "<br>");
        }
    }
    boolean checkSum(int sum){
        if(sum <= 18){
            return true;
        }else{
            return false;}
    }
    ArrayList myCards = new ArrayList();
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
