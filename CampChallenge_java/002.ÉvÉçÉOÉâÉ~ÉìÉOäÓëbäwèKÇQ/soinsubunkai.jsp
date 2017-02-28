<%-- 
    Document   : soinsubunkai
    Created on : Feb 28, 2017, 7:13:40 AM
    Author     : yoshi
--%>

<%@page import = "java.util.*" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
        // (注)仮に因数分解される数を102とする
        String hensu = request.getParameter("param");
        int input = Integer.parseInt(hensu);//分解したい数字を受け取り型を整数に変化
        int original = input;//分解をする数
        
        ArrayList<Integer> insu = new ArrayList<Integer>();//因数を格納
     
        int n = 0; //配列の要素数
        //素因数分解
        for(int i = 2; i <= input; i++){
        //小さい数から分解値したい数まで分解出来るかを調べる
        //もし割り切れる数があればまた分解する
        //もしfor文内で割れる数字が無ければ、イタレーションを出る
            if(input % i == 0){
                insu.add(i);
                n++;
                input = input / i;
                continue;
            }else{
                //最後の数字を格納
                insu.add(input);
                ;
            }
        }
        
       //結果の表示
       
        out.print("元の値:<br>");
       
        out.print(original + "<br>");
        
        out.print("一桁の素数:<br>");
        for(int i = 0; i <= insu.size() - 1/*配列の中の要素の数.。今の段階では仮の数をいれてる*/; i++){
            if(insu.get(i) < 10){        
                out.print(insu.get(i) + "<br>");
            }
        }
        out.print("その他:<br>");
        
        for(int i = 0; i <= insu.size() - 1/*配列の中の要素の数.。今の段階では仮の数をいれてる*/; i++){
            if(insu.get(i) > 10/*２と５の倍数なので*/){        
                out.print(insu.get(i) + "<br>");
            }
        }
        

        %>
    </body>
</html>
