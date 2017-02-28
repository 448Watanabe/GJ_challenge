<%-- 
    Document   : javaProgrammingBasic2-5
    Created on : Feb 24, 2017, 3:50:25 PM
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
        int x = 1000;
        
        while(x > 100){
            x = x /2;
            out.print(x + "<br>");
        }
        out.print(x);
        %>
    </body>
</html>
