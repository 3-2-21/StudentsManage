package student.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.inform.Student;
import student.service.IStudentService;
import student.service.impl.StudentServiceImpl;

public class updateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public updateServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		int no = Integer.parseInt(request.getParameter("sno"));
		
		String name = request.getParameter("sname");
		String gender = request.getParameter("sgender");
		int age = Integer.parseInt(request.getParameter("sage"));
		String major = request.getParameter("smajor");
		String  phone = request.getParameter("sphone");
		//将上述修改后的内容封装到实体类中
		Student student = new Student(no,name,gender,age,major,phone);	
		
		
		IStudentService  service = new StudentServiceImpl ();
		boolean result = service.updateStudentBySno(no,student);
		response.setContentType("text/html; charset=UTF-8");
		response.setCharacterEncoding("utf-8");
		if(result) {

			response.sendRedirect("queryByPage");
			
		}else {
			response.getWriter().print("修改失败！！");
		}
	}
	


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
