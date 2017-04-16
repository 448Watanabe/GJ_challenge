<%-- 
    Document   : javaBasic4
    Created on : Feb 22, 2017, 5:05:32 PM
    Author     : yoshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
int num1 = 1;
final int num2 = 2;

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        out.print(num1 + num2 + "<br>");
        out.print(num1 - num2 + "<br>");
        out.print(num1 * num2 + "<br>");
        out.print(num1 / num2 + "<br>");
        
        num1 = 4;
        
        out.print("<br>");
        out.print(num1 + num2 + "<br>");
        out.print(num1 - num2 + "<br>");
        out.print(num1 * num2 + "<br>");
        out.print(num1 / num2 + "<br>");

        %>
    </body>
</html>
