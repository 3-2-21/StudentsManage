package student.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.inform.Student;
import student.service.IStudentService;
import student.service.impl.StudentServiceImpl;



public class addServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("utf-8");
		int no = Integer.parseInt(request.getParameter("sno"));

		String name = request.getParameter("sname");
		String gender = request.getParameter("sgender");
		int age = Integer.parseInt(request.getParameter("sage"));
		String major = request.getParameter("smajor");
		String  phone = request.getParameter("sphone");
		//封装到实体类中
		Student student = new Student(no,name,gender,age,major,phone);
		
		IStudentService studentService = new StudentServiceImpl();
		boolean result = studentService.addStudent(student);
		//响应编码
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();//响应对象
		if(result) {
			response.sendRedirect("queryByPage");
		}else {
			out.println("增加失败！！");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
