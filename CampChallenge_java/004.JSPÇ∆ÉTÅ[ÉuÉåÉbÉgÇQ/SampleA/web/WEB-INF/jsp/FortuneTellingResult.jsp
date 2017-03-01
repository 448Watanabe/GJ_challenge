<%-- 
    Document   : FortuneTellingResult
    Created on : Mar 1, 2017, 3:12:19 PM
    Author     : yoshi
--%>

<%@page import="SamplePackage.ResultData" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        ResultData data = (ResultData)request.getAttribute("DATA");
        
        if(data != null){
            out.print("<h1>あなたの" + data.getD()+ "の運勢は" + data.getLuck()+ "です。</h1>");
        }
        
        %>
    </body>
</html>
