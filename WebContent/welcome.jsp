<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
<title>注册页面</title>
<style type="text/css">
.table{
    width: 600px; height: 400px;
    position: absolute; left: 0; top: 0; right: 0; bottom: 0;
    margin: auto; 
 }
 </style>
</head>
<body  background="images\g.jpg" 
style=" background-repeat:no-repeat ;
 background-size:100% 100%; 
 background-attachment: fixed;">
 <center>
     <form  >
      <div class="table">
      <%
     request.setCharacterEncoding("utf-8");
     String name = request.getParameter("name");
    
     String password = request.getParameter("pwd");        
     %>
     注册成功!2秒后自动跳转到登录页面
     <%response.addHeader("refresh", "2;URL=login.jsp"); %>
        
      </div>   
      
      </form>
    </center>
</body>
</html>