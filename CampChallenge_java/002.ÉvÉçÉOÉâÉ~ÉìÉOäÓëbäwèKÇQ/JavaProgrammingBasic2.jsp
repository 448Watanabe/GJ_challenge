<%-- 
    Document   : JavaProgrammingBasic2
    Created on : Feb 23, 2017, 5:42:26 PM
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
        int num = 10;
        String message = "";
        
        switch(num){
            case 1:
                message = "1ですが？";
                break;
            case 2:
                message = "2だけども";
                break;
            default:
                message = "想定外だわー";
        }
        out.print(message);
        
        %>
    </body>
</html>
