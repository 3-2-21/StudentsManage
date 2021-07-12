package student.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.inform.Major;
import student.inform.Student;
import student.service.IMajorService;
import student.service.IStudentService;
import student.service.impl.MajorServiceImpl;
import student.service.impl.StudentServiceImpl;

/**
 * Servlet implementation class queryMByMid
 */
public class queryMByMid extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int id = Integer.parseInt(request.getParameter("mid"));
		
		IMajorService  service = new MajorServiceImpl ();
		Major major = service.queryMByMid(id);
		System.out.println(major);
		
		request.setAttribute("major", major);
		request.getRequestDispatcher("M.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
