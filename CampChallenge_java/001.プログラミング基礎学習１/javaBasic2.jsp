<%-- 
    Document   : javaBasic2
    Created on : Feb 22, 2017, 4:34:36 PM
    Author     : yoshi
--%>

<%
String moji1 = "groove";
String moji2 = "-";
String moji3 = "gear";
 
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%
       out.print(moji1);
       out.print(moji2);
       out.print(moji3);
       %>
    </body>
</html>
