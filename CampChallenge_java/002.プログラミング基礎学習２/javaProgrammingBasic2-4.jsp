<%-- 
    Document   : javaProgrammingBasic2-4
    Created on : Feb 24, 2017, 3:47:15 PM
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
        int x = 0;
        for(int i = 1; i <= 100; i++){
        x = x + i;
        out.print(x + "<br>");
        
        }
        %>
    </body>
</html>
