package student.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.inform.Student;
import student.service.IStudentService;
import student.service.impl.StudentServiceImpl;


public class queryServlet extends HttpServlet {

    
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		IStudentService  service = new StudentServiceImpl ();
		List<Student> students = service.queryStudents();
		request.setAttribute("students", students);//重定向会丢失request域，request域有数据
		
		request.getRequestDispatcher("index.jsp").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
