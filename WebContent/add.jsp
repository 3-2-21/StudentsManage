<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" >
<title>新增页面</title>
<style type="text/css">
.table{

    width: 500px; height: 400px;
    position: absolute; left: 0; top: 10; right: 0; bottom: 30;
    margin: auto; 
 }
 </style>
</head>
<body  background="images\g.jpg" 
style=" background-repeat:no-repeat ;
 background-size:100% 100%; 
 background-attachment: fixed;">
 
     <form  action="addServlet" method="post">
     <div class="table">
     <table   style="background-size: 100%; opacity: 0.8; filter: alpha(opacity = 100)；margin:auto"   bgcolor="lightgrey" border="0" 
           width="75%"  cellpadding="8" cellspacing="10"  bordercolor="#FFFFFF"  >
           <tr>			
            <td align="center"><h1> 添加学生</h1> </td>
           </tr> 
            <tr>			
            <td align="center"> 学&nbsp;&nbsp;&nbsp;&nbsp;号：<input type="text" name = "sno"/></td>
            </tr>                    
                
            <tr>			
            <td align="center"> 姓&nbsp;&nbsp;&nbsp;&nbsp;名：<input type="text" name = "sname"/></td>
            </tr>
             <tr>			
            <td align="center">  性&nbsp;&nbsp;&nbsp;&nbsp;别：<input type="text"   name="sgender"/></td>
            </tr>
             <tr>			
            <td align="center">  年&nbsp;&nbsp;&nbsp;&nbsp;龄：<input type="text"  name="sage"/></td>
            </tr>
             <tr>			
            <td align="center">  专&nbsp;&nbsp;&nbsp;&nbsp;业：<input type="text"   name="smajor"/></td>
            </tr>
            <tr>			
            <td align="center">  电&nbsp;&nbsp;&nbsp;&nbsp;话：<input type="text"   name="sphone"/></td>
            </tr>
             <tr>			
            <td  align="center" ><input type="submit" value="确定增加"  />&nbsp;&nbsp;&nbsp;&nbsp;
             <a href="queryByPage"><input type = "button" value ="返回" /></a><br/><br/>
            </td></tr>
     
     </table>  </div>   
      
      </form>
   
</body>
</html>