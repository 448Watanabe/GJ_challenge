<%-- 
    Document   : javaProgrammingBasic2-8
    Created on : Feb 24, 2017, 5:06:01 PM
    Author     : yoshi
--%>

<%@pageimport = "java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        HashMap <String,String>yoshiMap = new HashMap<String, String>();
        yoshiMap.put("1","AAA");
        yoshiMap.put("hello","world");
        yoshiMap.put("soneda","33");
        yoshiMap.put("20","20");
        
        out.print("yoshi");
        // out.print(yoshiMap.get("hello"));
        // out.print(yoshiMap.size());
        
        %>
    </body>
</html>
