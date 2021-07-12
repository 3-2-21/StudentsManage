package student.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.service.IMajorService;
import student.service.IStudentService;
import student.service.impl.MajorServiceImpl;
import student.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class deleteMByMid
 */
public class deleteMByMid extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("mid"));
		IMajorService service = new MajorServiceImpl ();
		boolean result = service.deleteMByMid(id);
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("utf-8");		
		if(result) {
			response.sendRedirect("queryMajorByPage");
			
		}else {
			response.getWriter().print("É¾³ýÊ§°Ü£¡£¡");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
