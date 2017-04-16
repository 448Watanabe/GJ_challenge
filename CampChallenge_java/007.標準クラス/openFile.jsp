<%-- 
    Document   : openFile
    Created on : Mar 15, 2017, 5:35:18 PM
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
        <h1>
            <%
              File txt = new File(application.getRealPath("test.txt"));
              FileReader fr = new FileReader(txt);   
              /*
              ・FileReaderではpureなデータ（一文字レベルのバイナリーを呼び出す）
              ・BufferedReaderではより大きなレベルで読み込む（FRより括りが大きい）
              　　なのでBFの方が大きな単位で読み込んで出力する事が出来るようになっている
              ・大きな違いとしてはFRではreadline()などはないがBRにはある
              */
              BufferedReader br = new BufferedReader(fr);
              /*
              In computer science, a data buffer (or just buffer) is a region of
              a physical memory storage used to temporarily store data while it 
              is being moved from one place to another.
              */
              out.print(br.readLine());
              br.close();
            %>
        </h1>
    </body>
</html>
