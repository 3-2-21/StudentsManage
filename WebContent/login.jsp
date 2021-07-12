<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
<title>大学新生管理系统</title>

<style type="text/css">
.table{

    width: 600px; height: 400px;
    position: absolute; left: 0; top: 0; right: 0; bottom: 0;
    margin: auto; 
 }
 </style>
</head>


<body  background="images\g.jpg" style="background-repeat:no-repeat ;background-size:100% 100%;  background-attachment: fixed;">

<center>

<form action="LoginServlet" method="post" >
     <div class="table">
     <table   style="background-size: 100%; opacity: 0.8; filter: alpha(opacity = 100)；margin:auto"   bgcolor="lightgrey" border="0" 
           width="75%"  cellpadding="8" cellspacing="10"  bordercolor="#FFFFFF"  >
           <tr>
            <td style="width:100%;" align="center" valign="middle">
            </tr>
           <tr>			   
            <td align="center"><h1>大学新生管理系统</h1> </td>
            </tr>
            <tr><td></td>
           </tr>     
           <tr>			
            <td align="center"> 用户名：<input type="text" name = "name"/></td>
            </tr>         
            <tr>			
            <td align="center">  密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="text" name = "pwd"/></td>
            </tr>
             <tr>			
            <td  align="center" ><input type="submit" value="登录"  />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href = "register.jsp" target="blank"><input type = "button" value ="注册" ></input ></a>
           
            </tr>
      
     </table></div>
     </form>
     </center>

</body>



</html>