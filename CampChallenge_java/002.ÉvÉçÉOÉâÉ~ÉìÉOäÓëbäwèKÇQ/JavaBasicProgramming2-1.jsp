<%-- 
    Document   : JavaBasicProgramming2-1
    Created on : Feb 24, 2017, 3:18:06 PM
    Author     : yoshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        char alphabet = 'A';
        char hiragana = 'あ';
        
        char eval_word;
        eval_word = alphabet;
        
        switch(eval_word){
            case 'A':
                out.print("英語かいっ！");
                break;
            case 'あ':
                out.print("日本だよねー");
                break;
            default:
                
        }
        %>
    </body>
</html>
