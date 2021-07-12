<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="student.dao.LoginDao" %>
<%@ page import="student.inform.Login" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>跳转页面</title>
</head>
<body>
  <%
    request.setCharacterEncoding("utf-8");
    String name = request.getParameter("name");
	String pwd = request.getParameter("pwd");
	Login login = new Login(name,pwd);
	
	LoginDao dao = new LoginDao();
	int result = dao.login(login);
	if(result >0){
		out.print("登陆成功！");
	}else if(result ==0){
		out.print("用户名或密码有误！");
	}else{
		out.print("系统异常");		
	}
	
  %>

</body>
</html>