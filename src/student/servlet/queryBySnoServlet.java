package student.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.inform.Student;
import student.service.IStudentService;
import student.service.impl.StudentServiceImpl;


public class queryBySnoServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		int no = Integer.parseInt(request.getParameter("sno"));
		
		IStudentService  service = new StudentServiceImpl ();
		Student student = service.queryStudentBySno(no);
		System.out.println(student);
		
		request.setAttribute("student", student);
		request.getRequestDispatcher("query.jsp").forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
