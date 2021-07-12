package student.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student.inform.Page;
import student.inform.Student;
import student.service.IStudentService;
import student.service.impl.StudentServiceImpl;


public class queryByPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IStudentService studentService = new StudentServiceImpl();
		int count = studentService.getTotalCount();
		//将分页所需的字段组装到Page对象中
		Page page =new Page();
			
		String cPage = request.getParameter("currentPage");	
		if(cPage==null) {
			cPage="0";		
		}
		int currentPage = Integer.parseInt(cPage);
		page.setCurrentPage(currentPage);
		
		int totalCount = studentService.getTotalCount();
		page.setTotalCount(totalCount);
		
		//每页数据总数	
		int pageSize =8;
		page.setPageSize(pageSize);
		
		List<Student> students = studentService.queryStudentByPage(currentPage, pageSize);
		System.out.println(students);
		System.out.println(count);			
		page.setStudents(students);
		request.setAttribute("p", page);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
