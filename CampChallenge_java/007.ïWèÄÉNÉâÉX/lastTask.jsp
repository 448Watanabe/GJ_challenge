<%-- 
    Document   : lastTask
    Created on : Mar 16, 2017, 4:59:47 PM
    Author     : yoshi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"
        import = "java.lang.Math,java.text.*,java.util.Calendar,java.io.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        // 処理開始の書き込み
        Calendar cal = Calendar.getInstance();
        // out.print(cal.getTime() + "<br>");
        File txt = new File(application.getRealPath("log.txt")); 
        FileWriter fw = new FileWriter(txt);
        fw.write(cal.getTime() +" 開始<br>");
        // fw.close();
        
            // absを使った処理
            out.print("以下がabs()を使った処理<br>" + Math.abs(-1)+ "<br><br>");
        
        // 処理終了の書き込み
        Calendar cal2 = Calendar.getInstance();
        // out.print(cal.getTime() + "<br>");
        FileWriter fw2 = new FileWriter(txt,true);
        fw.write(cal2.getTime() + " 終了<br>");
        fw.close();
        
        // ログの表示
        FileReader fr = new FileReader(txt);
        BufferedReader br = new BufferedReader(fr);
        out.print("以下logの表示<br>");
        out.print(br.readLine());
        br.close();
        
        %>
    </body>
</html>
