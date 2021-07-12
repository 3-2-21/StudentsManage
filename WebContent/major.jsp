<%@page import="student.inform.Page"%>
<%@page import="student.inform.Major"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
<title>大学新生管理系统</title>
 <style type="text/css">
html, body  {
  height:100% ;
  overflow:hidden;
  background-color: #f1f1f1;
}
.header {
  background-color: #f1f1f1;
  padding: 20px;
  text-align: left;
}
 /* 导航条 */
 .header .topnav {
  width:100%;
  height:15px;
  background-color: #333;
}
.content {
	width:100%;
	height:600px;
	display:flex;
	justify-content: space-between;
	margin-top:20px;
}
/* 左侧栏 */
.content .leftcolumn {   
  width: 15%;
  background-color: #f1f1f1;
}
.content .leftcolumn ul {
  list-style: none;
}
.content .leftcolumn ul li a {
 color: blue;
 line-height: 3;
 font-weight: 800;
}
/* 右侧栏 */
.content .rightcolumn {
  width: 85%;
  background-color: #f1f1f1;
}
/* 底部样式 */
.footer {
  background-color:lightgray;
  display: block;
  color: #f2f2f2;
  padding:20px;
  text-align: center;
}
.footer a {
  padding:0 15px;
}
 </style>
 </head>
 <body>
 <div class="header">
	<h1>大学新生管理系统</h1>
   <div class="topnav"></div>
   <div class="content">
   <div class="leftcolumn">
	    <ul>     
	       <li><a href='queryByPage'>新生信息管理</a></li>
	       <li><a href='queryMajorByPage'>专业信息管理</a></li>
	       <li><a href='queryPayByPage'>缴费信息管理</a></li>
	       <li><a href="existServlet" target="_top">退出登录</a></li>
	    </ul>
	</div>
   <div class="rightcolumn ">
     <table rules="rows" style="background-size: 100%; opacity: 0.9; border:1px solid #999;filter: alpha(opacity = 100)"  
      bgcolor="#FFF" border="1" width="100%" cellpadding="15" cellspacing="15">
     <tr><th colspan="3" style="text-align: center;font-size: 20px;">专业信息列表</th></tr>     
     <tr bgcolor="lightgrey">
     <th>编号</th>
     <th>专业</th>
     <th>所属院系</th>
    
     </tr>     
         <% 
         Page p = (Page)request.getAttribute("p");
    	 for(Major major:p.getMajors()){    		
        %>    
        <tr>     
          <td><%=major.getMid()%></td>
          <td><%=major.getMname()%></td>
          <td><%=major.getMinclude()%></td>          
         
        </tr>   
        <% 
        }      
     %>
     </table>
    <div class="footer">  
     <a href="queryMajorByPage?currentPage=1">首页</a>&nbsp;&nbsp;&nbsp;&nbsp;
     <a href="queryMajorByPage?currentPage=<%=p.getCurrentPage()-1%>">上一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
     <a href="queryMajorByPage?currentPage=<%=p.getCurrentPage()+1%>">下一页</a>&nbsp;&nbsp;&nbsp;&nbsp;
     <a href="queryMajorByPage?currentPage=<%=p.getTotalPage()%>">尾页</a>&nbsp;&nbsp;&nbsp;&nbsp;     
    </div>
    </div>
    </div>
</div>
</body>
</html>