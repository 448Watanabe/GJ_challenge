<%-- 
    Document   : javaBasic5
    Created on : Feb 22, 2017, 5:14:53 PM
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
        int num = 3;
        
        if(num == 1){
            out.print("1です！");
        }else if(num == 2){
            out.print("プログラミングキャンプ！");
        }else{
            out.print("その他です！");
        }
        
        %>
    </body>
</html>
