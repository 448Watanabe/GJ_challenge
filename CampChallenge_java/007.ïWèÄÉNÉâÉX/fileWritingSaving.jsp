<%-- 
    Document   : fileWritingSaving
    Created on : Mar 16, 2017, 2:12:59 PM
    Author     : yoshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
        import = "java.util.*,java.text.*,java.io.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            File txt = new File(application.getRealPath("test.txt"));
            // この時のapplicaitonは自分自信（このファイル自体）を指しており
            // servletでは別のやり方をしなければならない
            FileWriter fw = new FileWriter(txt);
            //これだけだと追記は不可
            fw.write("My name is Yoshi ;)<br>");
            fw.close();
            //追記
            FileWriter fwa = new FileWriter(txt, true);
            fwa.write("<br>From Fukushima.");
            fwa.close();
            
            FileReader fr = new FileReader(txt);
            BufferedReader br = new BufferedReader(fr);
            out.print(br.readLine());
            br.close();
            
        %>
    </body>
</html>
