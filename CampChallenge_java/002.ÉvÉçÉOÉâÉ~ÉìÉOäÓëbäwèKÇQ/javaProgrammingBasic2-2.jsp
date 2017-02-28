<%-- 
    Document   : javaProgrammingBasic2-2
    Created on : Feb 24, 2017, 3:36:31 PM
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
        long x = 1;
        for(int i = 1; i <= 20; i++){
            x = x * 8;
            out.print(x + "<br>");
            
        }
        out.print(x);


        %>
    </body>
</html>
