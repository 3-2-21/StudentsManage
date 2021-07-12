package student.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import student.inform.Major;
import student.inform.Page;
import student.service.IMajorService;
import student.service.impl.MajorServiceImpl;


public class queryMajorByPage extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IMajorService majorService = new MajorServiceImpl();
		int count = majorService.getTotalCount();
		//����ҳ������ֶ���װ��Page������
		Page page =new Page();		
		String cPage = request.getParameter("currentPage");	
		if(cPage==null) {
			cPage="0";		
		}
		int currentPage = Integer.parseInt(cPage);
		page.setCurrentPage(currentPage);
		
		int totalCount = majorService.getTotalCount();
		page.setTotalCount(totalCount);	
		//ÿҳ��������	
		int pageSize =8;
		page.setPageSize(pageSize);
		
		List<Major> majors = majorService.queryMajorByPage(currentPage, pageSize);
		
		
		System.out.println(majors);
		System.out.println(count);			
		page.setMajors(majors);
		request.setAttribute("p", page);
		request.getRequestDispatcher("major.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
