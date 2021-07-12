<%@page import="student.inform.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
<title>详细信息</title>
</head>
<body  background="images\g.jpg" 
style=" background-repeat:no-repeat ;
 background-size:100% 100%; 
 background-attachment: fixed;">

  <%
  request.setCharacterEncoding("utf-8");
  Student student =(Student)request.getAttribute("student"); 
  %>
     <form action="updateServlet" >
      <table  style="background-size: 100%; opacity: 0.8; filter: alpha(opacity = 100)"   bgcolor="lightgrey" border="0" 
           width="30%"  cellpadding="9" cellspacing="15"  bordercolor="#FFFFFF"  align="center">
           <tr>			
            <td align="center"><h1>新生信息</h1> </td>
           </tr> 
            <tr>			
            <td align="center" style="display:none"> 序&nbsp;&nbsp;&nbsp;&nbsp;号：<input type="text" name = "sno"  readonly="readonly"  value="<%=student.getSno() %>"/></td>
            </tr>                    
           <tr>			
            <td align="center"> 学&nbsp;&nbsp;&nbsp;&nbsp;号：<input type="text" name = "sid" value="<%=student.getSno() %>"/></td>
            </tr>         
            <tr>			
            <td align="center"> 姓&nbsp;&nbsp;&nbsp;&nbsp;名：<input type="text" name = "sname"  value="<%=student.getSname() %>"/></td>
            </tr>
             <tr>			
            <td align="center">  性&nbsp;&nbsp;&nbsp;&nbsp;别：<input type="text"   name="sgender" value="<%=student.getSgender() %>"/></td>
            </tr>
             <tr>			
            <td align="center">  年&nbsp;&nbsp;&nbsp;&nbsp;龄：<input type="text"  name="sage"   value="<%=student.getSage() %>"/></td>
            </tr>
             <tr>			
            <td align="center">  专&nbsp;&nbsp;&nbsp;&nbsp;业：<input type="text"   name="smajor" value="<%=student.getSmajor() %>"/></td>
            </tr>
            <tr>			
            <td align="center">  电&nbsp;&nbsp;&nbsp;&nbsp;话：<input type="text"   name="sphone" value="<%=student.getSphone() %>"/></td>
            </tr>
             <tr>			
            <td  align="center" ><input type="submit" value="修改"/>&nbsp;&nbsp;&nbsp;
            <a href="queryByPage"><input type = "button" value ="返回" /></a>           
            </td></tr>    
     </table>           
     </form>
  
</body>
</html>