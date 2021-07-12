package student.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.dao.LoginDao;
import student.dao.RegisterDao;
import student.inform.Login;

/**
 * Servlet implementation class registerServlet
 */
public class registerServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html);charset=UTF-8");
		
		String name = request.getParameter("name");
		String pwd = request.getParameter("pwd");
		System.out.println("name:"+name+",pwd:"+pwd);
		Login login = new Login();
		login.setName(name);
		login.setPwd(pwd);
	
		int result = LoginDao.login( login );
		if(result !=0){
			request.getRequestDispatcher("welcome.jsp").forward(request, response);	
		}else if(result ==0){
			request.getRequestDispatcher("login.jsp").forward(request, response);			
//		   …Ë÷√2√Î÷”Ã¯◊™		
			response.addHeader("refresh", "2;URL=login.jsp"); 
		}
//		if(RegisterDao.register(Login)){
//			request.getRequestDispatcher("/WebContent/welcome.jsp").forward(request, response);
//		}else {
//			System.out.println("◊¢≤· ß∞‹");
//			request.getRequestDispatcher("/WebContent/register.jsp").forward(request, response);
//		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
