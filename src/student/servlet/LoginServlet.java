package student.servlet;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.dao.LoginDao;
import student.inform.Login;



public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public LoginServlet() {
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// �����¼
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		Login login = new Login(name,pwd);
		
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("utf-8");
//		����ģ�Ͳ��¼����
		int result = LoginDao.login( login );
		if(result >0){
			response.sendRedirect("queryByPage");	
		}else if(result ==0){
			response.getWriter().print("�û�������������2���ҳ���Զ���ת");			
//		   ����2������ת		
			response.addHeader("refresh", "2;URL=login.jsp"); 
		}
		
	}

		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
