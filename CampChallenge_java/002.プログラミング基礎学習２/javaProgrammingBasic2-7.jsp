    <%-- 
    Document   : javaProgrammingBasic2-7
    Created on : Feb 24, 2017, 5:02:58 PM
    Author     : yoshi
--%>

<%@page import = "java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <%
            String kata[] = {"10","100","soneda","-20","118","END"};
            
            // out.print(kata.length + "<br>");
            
            /* for(int i = 0; i <= kata.length -1; i++){
            out.print(kata[i] + "<br>");
            
            }--*/
            kata[2] = "33";
            out.print(kata[2]);
        %>
    </body>
</html>
